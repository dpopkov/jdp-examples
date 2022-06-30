package learn.dp.jdpexamples.c24visitor.example3;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Visitor and Composite Pattern Demo 2. ***");

        Employee hodMath = formMathDept();
        Employee hodCompSc = formComputerScDept();
        Employee principal = formPrincipal(hodMath, hodCompSc);
        printCollegeStructure(principal);

        Visitor visitor = new PromotionCheckerVisitor();
        System.out.println("\nChecking the eligible candidates for a promotion.");
        visitCandidates(principal, visitor);
    }

    private static void visitCandidates(Employee employee, Visitor visitor) {
        employee.acceptVisitor(visitor);
        employee.getSubordinates().forEach(s -> visitCandidates(s, visitor));
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
        Employee principal = new SeniorEmployee("Dr.S.Som", "Principal", 21);
        principal.addEmployee(hodMath);
        principal.addEmployee(hodCompSc);
        return principal;
    }
}
