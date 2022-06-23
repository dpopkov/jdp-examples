package learn.dp.jdpexamples.c18iterator.example3;

import java.util.Iterator;
import java.util.LinkedList;

class EmpDatabase implements Database {

    private final LinkedList<Employee> employees = new LinkedList<>();

    public EmpDatabase() {
        employees.add(new Employee(1, "Alice", 1000.0));
        employees.add(new Employee(2, "Bob", 2000.0));
        employees.add(new Employee(3, "John", 2500.0));
        employees.add(new Employee(4, "Jane", 3000.0));
        employees.add(new Employee(5, "James", 999.0));
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmpIterator(employees);
    }
}
