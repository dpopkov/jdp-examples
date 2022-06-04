package learn.dp.jdpexamples.c01solid.ocp.mysolution;

import learn.dp.jdpexamples.c01solid.ocp.Department;

import java.util.List;

public class DistinctionCriteria {

    private final String label;
    private final List<Department> departments;
    private final double distinctionScore;

    public DistinctionCriteria(String label, List<Department> departments, double distinctionScore) {
        this.label = label;
        this.departments = departments;
        this.distinctionScore = distinctionScore;
    }

    public boolean isPassedBy(Student student) {
        return departments.contains(student.getDepartment()) && student.getScore() > distinctionScore;
    }

    public String getLabel() {
        return label;
    }
}
