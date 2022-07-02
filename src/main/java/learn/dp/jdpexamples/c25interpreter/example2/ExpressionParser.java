package learn.dp.jdpexamples.c25interpreter.example2;

import java.util.ArrayDeque;
import java.util.Deque;

class ExpressionParser {
    private final Deque<Employee> stack = new ArrayDeque<>();
    private final Employee emp1;
    private final Employee emp2;
    private final Employee emp3;
    private final Employee emp4;

    public ExpressionParser() {
        emp1 = new IndividualEmployee(5, "G1");
        emp2 = new IndividualEmployee(10, "G2");
        emp3 = new IndividualEmployee(15, "G3");
        emp4 = new IndividualEmployee(20, "G4");
    }

    public void parse(String input) {
        stack.clear();
        final String[] tokens = input.toLowerCase().split(" ");
        for (String token : tokens) {
            if ("emp1".equals(token)) {
                stack.push(emp1);
            } else if ("emp2".equals(token)) {
                stack.push(emp2);
            } else if ("emp3".equals(token)) {
                stack.push(emp3);
            } else if ("emp4".equals(token)) {
                stack.push(emp4);
            } else {
                Employee right = stack.pop();
                Employee left = null;
                if ("and".equals(token) || "or".equals(token)) {
                    left = stack.pop();
                }
                Employee temp = evaluate(left, token, right);
                stack.push(temp);
            }
        }
    }

    public Employee getFinalExpression() {
        if (stack.size() != 1) {
            throw new IllegalStateException();
        }
        return stack.pop();
    }

    private Employee evaluate(Employee left, String operation, Employee right) {
        switch (operation) {
            case "or":
                return new OrExpression(left, right);
            case "and":
                return new AndExpression(left, right);
            case "not":
                if (left != null) {
                    throw new IllegalArgumentException("Illegal left argument - Operation NOT is unary operation");
                }
                return new NotExpression(right);
            default:
                System.out.println("You have used an invalid operator: " + operation);
                System.out.println("The result is always false for this expression");
                return new InvalidExpression();
        }
    }
}
