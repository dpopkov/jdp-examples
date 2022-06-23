package learn.dp.jdpexamples.c18iterator.example1;

class Client {

    public static void main(String[] args) {
        System.out.println("*** Iterator Patter Demo 1. ***");

        Department arts = new ArtsDepartment();
        Iterator artsIterator = arts.createIterator();
        System.out.println("Iterating over the Args Department subjects:");
        while (artsIterator.hasNext()) {
            System.out.println(artsIterator.next());
        }

        artsIterator.first();
        System.out.println("The pointer moves back to -> " + artsIterator.currentItem());
    }
}
