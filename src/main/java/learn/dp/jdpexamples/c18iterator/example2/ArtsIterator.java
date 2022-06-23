package learn.dp.jdpexamples.c18iterator.example2;

import java.util.Iterator;

class ArtsIterator implements Iterator<String> {

    private final String[] subjects;
    private int currentIndex;

    ArtsIterator(String[] subjects) {
        this.subjects = subjects;
    }

    public void first() {
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < subjects.length;
    }

    @Override
    public String next() {
        return subjects[currentIndex++];
    }

    public String currentItem() {
        return subjects[currentIndex];
    }
}
