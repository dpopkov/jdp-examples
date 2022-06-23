package learn.dp.jdpexamples.c18iterator.example2;

import java.util.Iterator;

class ArtsDepartment implements Department {
    private final String[] subjects;

    public ArtsDepartment() {
        subjects = new String[] {
                "1.English",
                "2.History",
                "3.Geography",
                "4.Psychology"
        };
    }

    @Override
    public Iterator<String> createIterator() {
        return new ArtsIterator(subjects);
    }
}
