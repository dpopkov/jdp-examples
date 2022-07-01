package learn.dp.jdpexamples.c25interpreter.example1;

class Client {

    private static Employee emp1, emp2, emp3, emp4;
    private static Employee employee;
    private static boolean result;
    private static final ExpressionBuilder builder = new ExpressionBuilder();
    private static final Context context = new Context(10, "G2", "G3");

    public static void main(String[] args) {
        System.out.println("*** Interpreter Pattern Demo 1. ***");

        initializeEmployees();
        validateSingleEmployee();
        validateSimpleRules();
        validateComplexRules();
    }

    private static void initializeEmployees() {
        emp1 = new IndividualEmployee(5, "G1");
        emp2 = new IndividualEmployee(10, "G2");
        emp3 = new IndividualEmployee(15, "G3");
        emp4 = new IndividualEmployee(20, "G4");
        System.out.println("Employee details are as follows:\n");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println("---------");
    }

    private static void validateSingleEmployee() {
        System.out.println("Is emp1 eligible for promotion? " + emp1.interpret(context));
        System.out.println("Is emp2 eligible for promotion? " + emp2.interpret(context));
        System.out.println("Is emp3 eligible for promotion? " + emp3.interpret(context));
        System.out.println("Is emp4 eligible for promotion? " + emp4.interpret(context));
        System.out.println("---------");
    }

    private static void validateSimpleRules() {
        System.out.println("\nIs either emp1 or emp3 eligible for promotion?");
        employee = builder.validateExpression(emp1, "Or", emp3);
        result = employee.interpret(context);
        System.out.println(result);
        System.out.println("\nAre both emp2 and emp4 eligible for promotion?");
        employee = builder.validateExpression(emp2, "And", emp4);
        result = employee.interpret(context);
        System.out.println(result);
        System.out.println("\nIs the statement- 'emp3 is NOT eligible for promotion' correct?");
        employee = builder.validateExpression(emp3, "Not", null);
        result = employee.interpret(context);
        System.out.println(result);
        System.out.println("---------");
    }

    private static void validateComplexRules() {
        System.out.println("Are emp1 and any of emp2, emp3, emp4 is eligible for promotion?");
        employee = builder.validateComplexExpression(emp1, emp2, emp3, emp4);
        result = employee.interpret(context);
        System.out.println(result);
        System.out.println("Are emp2 and any of emp1, emp3, emp4 is eligible for promotion?");
        employee = builder.validateComplexExpression(emp2, emp1, emp3, emp4);
        result = employee.interpret(context);
        System.out.println(result);
        System.out.println("---------");
    }
}
