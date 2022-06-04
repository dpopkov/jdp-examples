package learn.dp.jdpexamples.c01solid.ocp.booksolution;

import learn.dp.jdpexamples.c01solid.ocp.Department;

public class ScienceStudent extends Student {
    protected ScienceStudent(String name, String regNumber, double score, Department department) {
        super(name, regNumber, score, department);
    }
}
