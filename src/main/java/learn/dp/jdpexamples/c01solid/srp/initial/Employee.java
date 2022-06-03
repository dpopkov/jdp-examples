package learn.dp.jdpexamples.c01solid.srp.initial;

import java.util.Random;

/*
SRP violations:
- displays Employee details -- They can change the destination of output or the format of details.
- generates Employee ID -- They can change the algorithm to generate the employee id.
- checks seniority level -- The top management can set a different criterion to decide a seniority level.
 */
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

    public String getFirstName() {
        return firstName;
    }

    public double getExperienceInYears() {
        return experienceInYears;
    }

    public void displayEmpDetail() {
        System.out.println("The employee name: " + lastName + ", " + firstName);
        System.out.printf("This employee has %.2f years of experience%n", experienceInYears);
    }

    public String checkSeniority(double experienceInYears) {
        return experienceInYears > 5 ? "senior" : "junior";
    }

    public String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        empId = empFirstName.substring(0, 1) + random;
        return empId;
    }
}
