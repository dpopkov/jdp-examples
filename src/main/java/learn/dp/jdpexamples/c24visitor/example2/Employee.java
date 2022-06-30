package learn.dp.jdpexamples.c24visitor.example2;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    protected final String name;
    protected final String designation;
    protected final double experience;
    protected final List<Employee> subordinates = new ArrayList<>();
    protected int subordinatesCount;

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

    protected abstract int getSubordinatesCount();

    protected abstract void addEmployee(Employee e);

    protected abstract void removeEmployee(Employee e);

    public abstract void acceptVisitor(Visitor visitor);
}
