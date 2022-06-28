package learn.dp.jdpexamples.c23mediator;

class Employee extends Person {

    public Employee(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public String type() {
        return "Employee";
    }
}
