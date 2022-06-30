package learn.dp.jdpexamples.c24visitor.example1;

class IntegerProcessor implements NumberProcessor {

    private final int number = 5;

    public int getNumber() {
        return number;
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitNumber(this);
    }
}
