package learn.dp.jdpexamples.c01solid.ocp.initial;

import java.util.List;

public class DistinctionDecider {

    private final List<String> science = List.of("Comp.Sc.", "Physics");
    private final List<String> arts = List.of("History", "English");

    public void evaluateDistinction(Student student) {
        if (science.contains(student.getDepartment())) {
            if (student.getScore() > 80) {
                System.out.println(student.getRegNumber() + " has received a distinction in science.");
            }
        }
        if (arts.contains(student.getDepartment())) {
            if (student.getScore() > 70) {
                System.out.println(student.getRegNumber() + " has received a distinction in arts.");
            }
        }
    }
}
