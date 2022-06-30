package learn.dp.jdpexamples.c24visitor.example2;

import java.util.ArrayList;
import java.util.List;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Visitor and Composite Pattern Demo. ***");

        Employee hodMath = formMathDept();
        Employee hodCompSc = formComputerScDept();
        Employee principal = formPrincipal(hodMath, hodCompSc);
        printCollegeStructure(principal);

        List<Employee> participants = createContainer(principal, hodMath, hodCompSc);
        checkPromotionEligibility(participants);
    }

    private static void printCollegeStructure(Employee principal) {
        System.out.println("The details of the Principal object:");
        principal.printStructures();
    }

    private static Employee formComputerScDept() {
        // Three lecturers other than HOD work in the Computer Science Department.
        Employee cseTeacher1 = new JuniorEmployee("C.Kate", "Lecturer", 8.2);
        Employee cseTeacher2 = new JuniorEmployee("C.Jones", "Lecturer", 4.5);
        Employee cseTeacher3 = new JuniorEmployee("C.Proctor", "Lecturer", 6);
        Employee hodCompSc = new SeniorEmployee("Mr. V.Sarcar", "HOD(CSE)", 15.5);
        // Teachers of Computer Science directly reports to HOD-CSE
        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);
        return hodCompSc;
    }

    private static Employee formMathDept() {
        // Two lecturers other than HOD work in the Mathematics department.
        Employee mathTeacher1 = new JuniorEmployee("M.Jacob", "Lecturer", 7.5);
        Employee mathTeacher2 = new JuniorEmployee("M.Rustom", "Lecturer", 3);
        Employee hodMath = new SeniorEmployee("Mrs.S.Das", "HOD(Math)", 12.5);
        // Teachers of Mathematics directly reports to HOD-Mathematics
        hodMath.addEmployee(mathTeacher1);
        hodMath.addEmployee(mathTeacher2);
        return hodMath;
    }

    private static Employee formPrincipal(Employee hodMath, Employee hodCompSc) {
        // Principal of the college
        Employee principal = new SeniorEmployee("Dr.S.Som", "Principal", 21);
        // The Principal is on top of the college. The HOD(Mathematics) and HOD(Computer Sc.) directly report to him.
        principal.addEmployee(hodMath);
        principal.addEmployee(hodCompSc);
        return principal;
    }

    private static List<Employee> createContainer(Employee principal, Employee hodMath, Employee hodCompSc) {
        List<Employee> employeeContainer = new ArrayList<>();
        employeeContainer.addAll(principal.subordinates);
        employeeContainer.addAll(hodMath.subordinates);
        employeeContainer.addAll(hodCompSc.subordinates);
        return employeeContainer;
    }

    private static void checkPromotionEligibility(List<Employee> container) {
        Visitor visitor = new PromotionCheckerVisitor();
        System.out.println("\nChecking the eligible candidates for a promotion.");
        container.forEach(e -> e.acceptVisitor(visitor));
    }
}
