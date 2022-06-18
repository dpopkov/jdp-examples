package learn.dp.jdpexamples.c13composite;

import java.util.ArrayList;
import java.util.List;

class SeniorEmployee extends Employee {

    private final List<Employee> subordinates = new ArrayList<>();

    public SeniorEmployee(String name, String designation) {
        super(name, designation);
    }

    @Override
    protected void printStructures() {
        System.out.println("\t" + this.name + " is a " + this.designation);
        subordinates.forEach(Employee::printStructures);
    }

    @Override
    protected int getSubordinatesCount() {
        int count = subordinates.size();
        for (Employee e : subordinates) {
            count += e.getSubordinatesCount();
        }
        return count;
    }

    @Override
    protected void addEmployee(Employee e) {
        subordinates.add(e);
    }

    @Override
    protected void removeEmployee(Employee e) {
        subordinates.remove(e);
    }
}
