package edu.pnu.admin;
import edu.pnu.collection.*;

public class School {
    private final String name;
    private GenericList<Student> students = new GenericList<Student>();

    public School(final String name, int limit){
        this.name = name;
        students.setLimit(limit);
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeAllStudent(){
        students.clear();
    }
    public Student findStudent(String studentName, int schoolYear){
        Student target = new Student(studentName, schoolYear);
        return students.findData(target);
    }
    @Override
    public String toString(){
        String str = String.format("School Name: %s Student Count: %d\n", name, students.getSize());
        str += students.toString();
        return str;
    }
}
