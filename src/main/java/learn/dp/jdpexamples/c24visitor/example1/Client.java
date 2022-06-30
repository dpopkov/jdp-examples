package learn.dp.jdpexamples.c24visitor.example1;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Visitor Pattern Demo. ***");

        NumberProcessor targetInteger = new IntegerProcessor();
        System.out.println("Testing the IncrementorVisitor now.");
        Visitor visitor = new IncrementorVisitor();
        targetInteger.acceptVisitor(visitor);

        System.out.println("Testing the DoubleMakerVisitor now.");
        visitor = new DoubleMakerVisitor();
        targetInteger.acceptVisitor(visitor);
    }
}
