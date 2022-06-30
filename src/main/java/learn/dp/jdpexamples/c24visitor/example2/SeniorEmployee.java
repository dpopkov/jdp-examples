package learn.dp.jdpexamples.c24visitor.example2;

class SeniorEmployee extends Employee {

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
    protected int getSubordinatesCount() {
        subordinatesCount = subordinates.size();
        subordinates.forEach(s -> subordinatesCount += s.getSubordinatesCount());
        return subordinatesCount;
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
