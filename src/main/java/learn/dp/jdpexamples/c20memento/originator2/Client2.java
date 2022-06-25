package learn.dp.jdpexamples.c20memento.originator2;

import java.util.ArrayList;
import java.util.List;

class Client2 {

    public static void main(String[] args) {
        System.out.println("*** Memento Pattern Demo 2. ***");

        Originator originator = new Originator();
        List<Originator.Memento> savedMementos = new ArrayList<>();

        saveSnapShot(originator, "Snapshot #0", savedMementos);
        saveSnapShot(originator, "Snapshot #1", savedMementos);
        saveSnapShot(originator, "Snapshot #2", savedMementos);
        saveSnapShot(originator, "Snapshot #3", savedMementos);
        originator.setState("Snapshot #4");

        System.out.println("\nStarted restoring process...");
        for (int i = savedMementos.size() - 1; i >= 0; i--) {
            originator.restoreFrom(savedMementos.get(i));
        }

        System.out.println("\nPerforming redo's now...");
        for (int i = 1; i < savedMementos.size(); i++) {
            originator.restoreFrom(savedMementos.get(i));
        }

        System.out.println("\nRestoring to Snapshot #1");
        originator.restoreFrom(savedMementos.get(1));
    }

    private static void saveSnapShot(Originator originator, String checkpoint, List<Originator.Memento> mementos) {
        originator.setState(checkpoint);
        mementos.add(originator.getMemento());
    }

}
