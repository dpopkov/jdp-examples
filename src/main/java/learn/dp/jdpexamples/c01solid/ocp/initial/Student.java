package learn.dp.jdpexamples.c01solid.ocp.initial;

public class Student {
    private final String name;
    private final String regNumber;
    private final String department;
    private final double score;

    public Student(String name, String regNumber, double score, String department) {
        this.name = name;
        this.regNumber = regNumber;
        this.department = department;
        this.score = score;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getDepartment() {
        return department;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", department='" + department + '\'' +
                ", score=" + score +
                '}';
    }
}
