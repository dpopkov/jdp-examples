package learn.dp.jdpexamples.c24visitor.example1;

class DoubleMakerVisitor implements Visitor {
    @Override
    public void visitNumber(IntegerProcessor processor) {
        System.out.println("The flag value is: " + processor.getNumber());
        System.out.println("Myltiplying it by 2.");
        int temp = processor.getNumber() * 2;
        System.out.println("The new value is: " + temp);
    }
}
