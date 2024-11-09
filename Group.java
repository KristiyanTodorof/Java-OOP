package TaskOne;

import java.util.*;

public class Group {
    private int course;
    private String spec;
    private ArrayList<Student> students;
    private int numberOfStudents;

    public Group(int course, String spec, ArrayList<Student> students, int numberOfStudents) {
        this(course, spec);
        this.students = students;
        this.numberOfStudents = numberOfStudents;
    }

    public Group(int course, String spec) {
        this.course = course;
        this.spec = spec;
        this.students = new ArrayList<>();
    }

    public void AddStudent(Student student){
        students.add(student);
    }

    public int getCourse() {
        return course;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getSpec() {
        return spec;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('\'').append(spec).append("' course=").append(course).append(", numberOfStudents=").append(numberOfStudents).append(", students: \n");
        for (Student student : students){
          builder.append(student).append('\n');
        }
        return builder.toString();
    }
}
