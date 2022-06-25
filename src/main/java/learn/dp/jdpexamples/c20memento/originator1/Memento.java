package learn.dp.jdpexamples.c20memento.originator1;

/**
 * The Memento class. Only the {@link Originator} can store and retrieve necessary information
 * from the Memento. This Memento is "opaque" to other objects.
 */
public class Memento {
    final String state;

    Memento(String state) {
        this.state = state;
    }
}
