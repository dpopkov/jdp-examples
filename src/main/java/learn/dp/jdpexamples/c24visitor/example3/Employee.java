package learn.dp.jdpexamples.c24visitor.example3;

import java.util.Collections;
import java.util.List;

abstract class Employee {
    protected final String name;
    protected final String designation;
    protected final double experience;

    public Employee(String name, String designation, double experience) {
        this.name = name;
        this.designation = designation;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public double getExperience() {
        return experience;
    }

    protected abstract void printStructures();

    public List<Employee> getSubordinates() {
        return Collections.emptyList();
    }

    protected abstract void addEmployee(Employee e);

    protected abstract void removeEmployee(Employee e);

    public abstract void acceptVisitor(Visitor visitor);
}
