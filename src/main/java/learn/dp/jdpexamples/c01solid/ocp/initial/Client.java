package learn.dp.jdpexamples.c01solid.ocp.initial;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo without OCP.***");
        List<Student> enrolledStudents = enrollStudents();

        // Display all results.
        System.out.println("===Results:===");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
        System.out.println("===Distinctions:===");
        DistinctionDecider distinctionDecider = new DistinctionDecider();

        // Evaluate distinctions.
        for (Student student : enrolledStudents) {
            distinctionDecider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sam", "R1", 81.5, "Comp.Sc."));
        students.add(new Student("Bob", "R2", 72, "Physics"));
        students.add(new Student("John", "R3", 71, "History"));
        students.add(new Student("Kate", "R4", 66.5, "English"));
        return students;
    }
}
