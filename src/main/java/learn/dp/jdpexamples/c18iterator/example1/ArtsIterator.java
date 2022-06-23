package learn.dp.jdpexamples.c18iterator.example1;

class ArtsIterator implements Iterator {

    private final String[] subjects;
    private int currentIndex;

    ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        currentIndex = 0;
    }

    @Override
    public void first() {
        currentIndex = 0;
    }

    @Override
    public String next() {
        return subjects[currentIndex++];
    }

    @Override
    public String currentItem() {
        return subjects[currentIndex];
    }

    @Override
    public boolean hasNext() {
        return currentIndex < subjects.length;
    }
}
