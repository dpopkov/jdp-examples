package learn.dp.jdpexamples.c25interpreter.example2;

class Client {

    private static final Context context = new Context(10, "G2", "G3");

    public static void main(String[] args) {
        System.out.println("*** Interpreter Demo 2. ***");
        
        String[] inputs = {
                "emp1",
                "emp2",
                "emp3",
                "emp4",
                "emp1 not",
                "emp2 not",
                "emp4 emp2 not and",
                "emp3 emp4 emp2 not and or",
                "emp2 emp3 emp4 emp2 not and or or"
        };
        ExpressionParser parser = new ExpressionParser();
        for (String input : inputs) {
            System.out.print("input = " + input + " :  ");
            parser.parse(input);
            boolean result = parser.getFinalExpression().interpret(context);
            System.out.println("result = " + result);
        }
    }
}
