import java.util.Objects;

public class Student {
    private String name;
    private int year;

    public Student(String name, int year){
        this.name = new String(name);
        this.year = year;
    }
    public Student(Student other){
        name = new String(other.name);
        year = other.year;
    }

    @Override
    public String toString(){
        return String.format("%s, %díë", name, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return year == student.year && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
