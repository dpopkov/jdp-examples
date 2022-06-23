package learn.dp.jdpexamples.c18iterator.example3;

import java.util.Iterator;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Iterator Patter Demo 2. ***");

        EmpDatabase database = new EmpDatabase();
        Iterator<Employee> iterator = database.createIterator();
        System.out.println("Iterating over the Employee database:");
        iterator.forEachRemaining(System.out::println);

        ((EmpIterator) iterator).first();
        System.out.println("The pointer moves back to -> " + iterator.next());
    }
}
