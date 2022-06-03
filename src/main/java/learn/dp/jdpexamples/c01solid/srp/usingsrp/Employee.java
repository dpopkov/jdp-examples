package learn.dp.jdpexamples.c01solid.srp.usingsrp;

public class Employee {
    private final String lastName;
    private final double experienceInYears;
    private final String firstName;
    private String empId;

    public Employee(String firstName, String lastName, double experienceInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experienceInYears;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }

    public String getEmployeeDetail() {
        return String.format("The employee name: %s, %s%n"
                + "This employee has %.2f years of experience",
                lastName, firstName, experienceInYears);
    }
}
