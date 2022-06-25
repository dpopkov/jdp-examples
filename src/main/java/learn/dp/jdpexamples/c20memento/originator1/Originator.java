package learn.dp.jdpexamples.c20memento.originator1;

/**
 * This is the Originator class.
 * 1 - It creates a memento object that contains a snapshot of its current internal state;
 * 2 - It uses a memento to restore its internal state.
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.print("The current state is " + state);
    }

    public void restoreFrom(Memento memento) {
        this.state = memento.state;
        System.out.println("Restored to state: " + this.state);
    }

    public Memento getMemento() {
        return new Memento(this.state);
    }
}
