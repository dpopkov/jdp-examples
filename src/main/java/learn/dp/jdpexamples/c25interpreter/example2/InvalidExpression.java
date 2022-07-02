package learn.dp.jdpexamples.c25interpreter.example2;

class InvalidExpression implements Employee {

    @Override
    public boolean interpret(Context context) {
        return false;
    }
}
