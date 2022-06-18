package learn.dp.jdpexamples.c13composite;

abstract class Employee {
    protected final String name;
    protected final String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    protected abstract void printStructures();

    protected abstract int getSubordinatesCount();

    protected abstract void addEmployee(Employee e);

    protected abstract void removeEmployee(Employee e);
}
