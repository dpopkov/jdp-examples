package learn.dp.jdpexamples.c01solid.srp.initial;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** A demo without SRP ***");
        Employee john = new Employee("John", "Sparrow", 8.5);
        showEmpDetail(john);
        System.out.println("-------------------");
        Employee alice = new Employee("Alice", "Dow", 3.1);
        showEmpDetail(alice);

    }

    private static void showEmpDetail(Employee emp) {
        emp.displayEmpDetail();
        System.out.println("The employee id: " + emp.generateEmpId(emp.getFirstName()));
        System.out.println("This employee is a " + emp.checkSeniority(emp.getExperienceInYears()) + " employee.");
    }
}
