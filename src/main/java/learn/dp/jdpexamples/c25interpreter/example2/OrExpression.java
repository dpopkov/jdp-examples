package learn.dp.jdpexamples.c25interpreter.example2;

class OrExpression implements Employee {

    private final Employee emp1;
    private final Employee emp2;

    OrExpression(Employee emp1, Employee emp2) {
        this.emp1 = emp1;
        this.emp2 = emp2;
    }

    @Override
    public boolean interpret(Context context) {
        return emp1.interpret(context) || emp2.interpret(context);
    }
}
