import java.util.Arrays;
import java.util.Objects;

public class School {
    private String name;
    private int limit;

    private Student[] students;
    private int studentCount;

    public School(String name, int limit){
        this.name = new String(name);
        this.limit = limit;
        students = new Student[limit];
    }

    public void addStudent(Student student){
        students[studentCount] = new Student(student);
        studentCount++;
    }

    public void removeAllStudent(){
        for(int i=0; i<studentCount; i++){
            students[i] = null;
        }
        studentCount = 0;
    }
    public Student findStudent(String studentName, int schoolYear){
        Student studentTemp = new Student(studentName, schoolYear);
        for(int i=0; i<studentCount; i++){
            if(studentTemp.equals(students[i])) return students[i];
        }
        return null;
    }

    @Override
    public String toString(){
        String msg = "School Name: " + name + " Student Count: " + studentCount + "\n";
        for(int i=0; i<studentCount; i++){
            msg += "\t" + students[i] + "\n";
        }
        return msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return limit == school.limit && studentCount == school.studentCount && Objects.equals(name, school.name) && Arrays.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, limit, studentCount);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }
}
