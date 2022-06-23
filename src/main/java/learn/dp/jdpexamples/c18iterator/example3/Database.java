package learn.dp.jdpexamples.c18iterator.example3;

import java.util.Iterator;

interface Database {

    Iterator<Employee> createIterator();
}
