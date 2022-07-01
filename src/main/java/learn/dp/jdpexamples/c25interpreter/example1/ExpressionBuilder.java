package learn.dp.jdpexamples.c25interpreter.example1;

class ExpressionBuilder {

    public Employee validateExpression(Employee emp1, String operator, Employee emp2) {
        switch (operator.toLowerCase()) {
            case "or":
                return new OrExpression(emp1, emp2);
            case "and":
                return new AndExpression(emp1, emp2);
            case "not":
                if (emp2 != null) {
                    throw new IllegalArgumentException("Illegal second argument - Operation NOT is unary operation");
                }
                return new NotExpression(emp1);
            default:
                System.out.println("You have used an invalid operator: " + operator);
                System.out.println("The result is always false for this expression");
                return new InvalidExpression();
        }
    }

    /**
     * Validates the expression: emp1 and (emp2 or (emp3 or emp4))
     */
    public Employee validateComplexExpression(Employee emp1, Employee emp2, Employee emp3, Employee emp4) {
        Employee result = new OrExpression(emp3, emp4);
        result = new OrExpression(emp2, result);
        result = new AndExpression(emp1, result);
        return result;
    }
}
