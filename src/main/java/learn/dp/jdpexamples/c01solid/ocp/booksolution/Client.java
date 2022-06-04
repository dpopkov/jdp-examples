package learn.dp.jdpexamples.c01solid.ocp.booksolution;

import java.util.ArrayList;
import java.util.List;

import static learn.dp.jdpexamples.c01solid.ocp.Department.*;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo that follows the OCP.***");
        List<Student> scienceStudents = enrollScienceStudents();
        List<Student> artsStudents = enrollArtsStudents();

        // Display all results.
        System.out.println("===Results:===");
        for (Student student : scienceStudents) {
            System.out.println(student);
        }
        for (Student student : artsStudents) {
            System.out.println(student);
        }

        // Evaluate distinctions.
        DistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();
        DistinctionDecider artsDistinctionDecider = new ArtsDistinctionDecider();
        System.out.println("===Distinctions:===");
        for (Student student : scienceStudents) {
            scienceDistinctionDecider.evaluateDistinction(student);
        }
        for (Student student : artsStudents) {
            artsDistinctionDecider.evaluateDistinction(student);
        }
    }

    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam", "R1", 81.5, COMPUTER_SCIENCE);
        Student bob = new ScienceStudent("Bob", "R2", 72, PHYSICS);
        List<Student> scienceStudents = new ArrayList<>();
        scienceStudents.add(sam);
        scienceStudents.add(bob);
        return scienceStudents;
    }

    private static List<Student> enrollArtsStudents() {
        Student john = new ArtsStudent("John", "R3", 71, HISTORY);
        Student kate = new ArtsStudent("Kate", "R4", 66.5, ENGLISH);
        List<Student> artsStudents = new ArrayList<>();
        artsStudents.add(john);
        artsStudents.add(kate);
        return artsStudents;
    }
}
