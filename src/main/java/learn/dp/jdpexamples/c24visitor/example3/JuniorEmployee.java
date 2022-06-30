package learn.dp.jdpexamples.c24visitor.example3;

class JuniorEmployee extends Employee {

    public JuniorEmployee(String name, String designation, double experience) {
        super(name, designation, experience);
    }

    @Override
    protected void printStructures() {
        System.out.println("\t" + this.name + " is a " + this.designation
                + ". Experience:" + this.experience);
    }

    @Override
    protected void addEmployee(Employee e) {
    }

    @Override
    protected void removeEmployee(Employee e) {
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
