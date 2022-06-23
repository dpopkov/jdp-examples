package learn.dp.jdpexamples.c18iterator.example3;

import java.util.Iterator;
import java.util.List;

class EmpIterator implements Iterator<Employee> {

    private final List<Employee> employees;
    private Iterator<Employee> innerIterator;

    EmpIterator(List<Employee> employees) {
        this.employees = employees;
        innerIterator = employees.iterator();
    }

    public void first() {
        innerIterator = employees.iterator();
    }

    @Override
    public boolean hasNext() {
        return innerIterator.hasNext();
    }

    @Override
    public Employee next() {
        return innerIterator.next();
    }
}
