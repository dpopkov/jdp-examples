package learn.dp.jdpexamples.c18iterator.example2;

import java.util.Iterator;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Iterator Patter Demo 2. ***");

        Department arts = new ArtsDepartment();
        Iterator<String> artsIterator = arts.createIterator();
        System.out.println("Iterating over the Args Department subjects:");
        while (artsIterator.hasNext()) {
            System.out.println(artsIterator.next());
        }

        ((ArtsIterator) artsIterator).first();
        System.out.println("The pointer moves back to -> " + ((ArtsIterator) artsIterator).currentItem());
    }
}
