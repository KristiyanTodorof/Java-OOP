import TaskOne.Group;
import TaskOne.Student;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student("Kristiyan Todorov", 19, "2309010565");
        Student secondStudent = new Student("Alex Dimitrov", 19, "2309010645");
        Student thirdStudent = new Student("Krasen Nedelchev", 19, "2309010678");

        ArrayList<Student> students = new ArrayList<>();
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);

        Random r = new Random();

        for (Student s :
                students) {
            s.PassExam(4 + r.nextDouble(2));
            s.PassExam(3 + r.nextDouble(3));
            s.PassExam(3 + r.nextDouble(3));
        }

        Group firstGroup = new Group(2, "Computer Science", students, 3);
        Group secondGroup = new Group(2, "Software Engineers");

        firstGroup.AddStudent(firstStudent);
        firstGroup.AddStudent(secondStudent);
        firstGroup.AddStudent(thirdStudent);

        System.out.println(firstGroup);
    }
}