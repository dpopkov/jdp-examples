package learn.dp.jdpexamples.c01solid.srp.usingsrp;

public class SeniorityChecker {

    private final double seniorityLevel;

    public SeniorityChecker(double seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

    public Seniority checkSeniority(Employee employee) {
        return employee.getExperienceInYears() > seniorityLevel
                ? Seniority.SENIOR
                : Seniority.JUNIOR;
    }
}
