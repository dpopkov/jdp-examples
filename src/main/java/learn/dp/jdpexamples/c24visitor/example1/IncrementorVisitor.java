package learn.dp.jdpexamples.c24visitor.example1;

class IncrementorVisitor implements Visitor {
    @Override
    public void visitNumber(IntegerProcessor processor) {
        System.out.println("The flag value is: " + processor.getNumber());
        System.out.println("Incrementing it by 10.");
        int temp = processor.getNumber() + 10;
        System.out.println("The new value is: " + temp);
    }
}
