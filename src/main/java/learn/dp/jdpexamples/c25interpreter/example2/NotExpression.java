package learn.dp.jdpexamples.c25interpreter.example2;

class NotExpression implements Employee {

    private final Employee emp1;

    NotExpression(Employee emp1) {
        this.emp1 = emp1;
    }

    @Override
    public boolean interpret(Context context) {
        return !emp1.interpret(context);
    }
}
