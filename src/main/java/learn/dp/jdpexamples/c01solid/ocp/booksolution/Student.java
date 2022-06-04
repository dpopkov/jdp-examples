package learn.dp.jdpexamples.c01solid.ocp.booksolution;

import learn.dp.jdpexamples.c01solid.ocp.Department;

public abstract class Student {
    private final String name;
    private final String regNumber;
    private final Department department;
    private final double score;

    protected Student(String name, String regNumber, double score, Department department) {
        this.name = name;
        this.regNumber = regNumber;
        this.department = department;
        this.score = score;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", department='" + department.getLabel() + '\'' +
                ", score=" + score +
                '}';
    }
}
