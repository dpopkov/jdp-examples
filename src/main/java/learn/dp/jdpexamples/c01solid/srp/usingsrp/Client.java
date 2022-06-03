package learn.dp.jdpexamples.c01solid.srp.usingsrp;

import java.io.PrintStream;

public class Client {
    private final PrintStream out;

    public Client(PrintStream out) {
        this.out = out;
    }

    public static void main(String[] args) {
        Client client = new Client(System.out);
        client.run();
    }

    public void run() {
        out.println("*** A demo with SRP ***");
        Employee john = new Employee("John", "Sparrow", 8.5);
        showEmpDetail(john);
        out.println("-------------------");
        Employee alice = new Employee("Alice", "Dow", 3.1);
        showEmpDetail(alice);
    }

    private void showEmpDetail(Employee emp) {
        out.println(emp.getEmployeeDetail());

        EmployeeIdGenerator generator = new EmployeeIdGenerator();
        emp.setEmpId(generator.generateEmpId(emp));
        out.println("The employee id: " + emp.getEmpId());

        SeniorityChecker seniorityChecker = new SeniorityChecker(5);
        Seniority seniority = seniorityChecker.checkSeniority(emp);
        out.println("This employee is a " + seniority.toLowerCase() + " employee.");
    }
}
