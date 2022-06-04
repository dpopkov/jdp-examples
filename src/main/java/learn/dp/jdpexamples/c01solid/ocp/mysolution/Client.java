package learn.dp.jdpexamples.c01solid.ocp.mysolution;

import java.util.ArrayList;
import java.util.List;

import static learn.dp.jdpexamples.c01solid.ocp.Department.*;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** My Solution with OCP.***");
        List<Student> students = enrollStudents();

        // Display all results.
        System.out.println("===Results:===");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("===Distinctions:===");
        var decider = new DistinctionDecider();
        decider.addCriteria(new DistinctionCriteria("science", List.of(COMPUTER_SCIENCE, PHYSICS), 80));
        decider.addCriteria(new DistinctionCriteria("arts", List.of(HISTORY, ENGLISH), 70));

        // Evaluate distinctions.
        for (Student student : students) {
            decider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sam", "R1", 81.5, COMPUTER_SCIENCE));
        students.add(new Student("Bob", "R2", 72, PHYSICS));
        students.add(new Student("John", "R3", 71, HISTORY));
        students.add(new Student("Kate", "R4", 66.5, ENGLISH));
        return students;
    }
}
