package learn.dp.jdpexamples.c01solid.srp.usingsrp;

import java.util.Random;

public class EmployeeIdGenerator {

    private final Random random = new Random();

    public String generateEmpId(Employee employee) {
        return employee.getFirstName().substring(0, 1) + random.nextInt(1000);
    }
}
