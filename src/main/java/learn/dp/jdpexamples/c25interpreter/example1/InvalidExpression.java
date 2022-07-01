package learn.dp.jdpexamples.c25interpreter.example1;

class InvalidExpression implements Employee  {

    @Override
    public boolean interpret(Context context) {
        return false;
    }
}
