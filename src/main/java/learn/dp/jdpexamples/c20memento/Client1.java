package learn.dp.jdpexamples.c20memento;

import learn.dp.jdpexamples.c20memento.originator1.Memento;
import learn.dp.jdpexamples.c20memento.originator1.Originator;

import java.util.*;

class Client1 {

    public static void main(String[] args) {
        System.out.println("*** Memento Pattern Demo 1. ***");

        Originator originator = new Originator();
        List<Memento> savedMementos = new ArrayList<>();
        saveSnapShot(originator, "Snapshot #0", savedMementos);
        saveSnapShot(originator, "Snapshot #1", savedMementos);
        saveSnapShot(originator, "Snapshot #2", savedMementos);
        saveSnapShot(originator, "Snapshot #3", savedMementos);
        originator.setState("Snapshot #4");

        System.out.println("\n\nStarted restoring process...");
        for (int i = savedMementos.size() - 1; i >= 0; i--) {
            Memento memento = savedMementos.get(i);
            originator.restoreFrom(memento);
        }

        System.out.println("\nPerforming redo's now...");
        for (int i = 1; i < savedMementos.size(); i++) {
            Memento memento = savedMementos.get(i);
            originator.restoreFrom(memento);
        }

        System.out.println("\nRestoring to Snapshot #1");
        originator.restoreFrom(savedMementos.get(1));
    }

    private static void saveSnapShot(Originator originator, String checkpoint, List<Memento> mementos) {
        originator.setState(checkpoint);
        Memento memento = originator.getMemento();
        System.out.println(". Saving this checkpoint.");
        mementos.add(memento);
    }
}
