package learn.dp.jdpexamples.c24visitor.example3;

import java.util.ArrayList;
import java.util.List;

class SeniorEmployee extends Employee {

    private final List<Employee> subordinates = new ArrayList<>();

    public SeniorEmployee(String name, String designation, double experience) {
        super(name, designation, experience);
    }

    @Override
    protected void printStructures() {
        System.out.println("\t" + this.name + " is a " + this.designation
                + ". Experience:" + this.experience);
        subordinates.forEach(Employee::printStructures);
    }

    @Override
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    protected void addEmployee(Employee e) {
        subordinates.add(e);
    }

    @Override
    protected void removeEmployee(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
