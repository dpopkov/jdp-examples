package learn.dp.jdpexamples.c13composite;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Composite Pattern Demo. ***");

        Employee headOfMathDepartment = formMathDepartment();
        Employee headOfCsDepartment = formComputerScienceDepartment();
        Employee principal = formPrincipal(headOfCsDepartment, headOfMathDepartment);

        System.out.println("The details of the Principal object:");
        principal.printStructures();

        System.out.println("\nThe details of the HoD (Comp Sc) object:");
        headOfCsDepartment.printStructures();

        System.out.println("\nThe details of the HoD (Math) object:");
        headOfMathDepartment.printStructures();
    }

    private static Employee formPrincipal(Employee... heads) {
        System.out.println("Forming the top-level management.");
        System.out.println("A principal with two HoD's is here.\n");
        Employee principal = new SeniorEmployee("Dr.S.Jackson", "Principal");
        for (Employee head : heads) {
            principal.addEmployee(head);
        }
        return principal;
    }

    private static Employee formComputerScienceDepartment() {
        System.out.println("Forming Computer Science department.");
        System.out.println("A HoD with three lecturers is here.\n");
        Employee csTeacher1 = new JuniorEmployee("C.Kafka", "Lecturer");
        Employee csTeacher2 = new JuniorEmployee("C.Rabbit", "Lecturer");
        Employee csTeacher3 = new JuniorEmployee("C.Postgres", "Lecturer");
        Employee headOfCs = new SeniorEmployee("Mr.J.Gosling", "Head of Computer Science Department");
        headOfCs.addEmployee(csTeacher1);
        headOfCs.addEmployee(csTeacher2);
        headOfCs.addEmployee(csTeacher3);
        return headOfCs;
    }

    private static Employee formMathDepartment() {
        System.out.println("Forming Mathematics department.");
        System.out.println("A HoD with two lectures in here.\n");
        Employee mathTeacher1 = new JuniorEmployee("M.Doe", "Lecturer");
        Employee mathTeacher2 = new JuniorEmployee("M.Smith", "Lecturer");
        Employee headOfMath = new SeniorEmployee("Mrs.Perkins", "Head of Math Department");
        headOfMath.addEmployee(mathTeacher1);
        headOfMath.addEmployee(mathTeacher2);
        return headOfMath;
    }
}
