package learn.dp.jdpexamples.c13composite;

class JuniorEmployee extends Employee {

    public JuniorEmployee(String name, String designation) {
        super(name, designation);
    }

    @Override
    protected void printStructures() {
        System.out.println("\t\t" + this.name + " is a " + this.designation);
    }

    @Override
    protected int getSubordinatesCount() {
        return 0;
    }

    @Override
    protected void addEmployee(Employee e) {
        // empty method
    }

    @Override
    protected void removeEmployee(Employee e) {
        // empty method
    }
}
