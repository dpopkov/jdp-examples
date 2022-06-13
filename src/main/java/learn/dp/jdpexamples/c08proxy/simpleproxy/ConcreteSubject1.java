package learn.dp.jdpexamples.c08proxy.simpleproxy;

import learn.dp.jdpexamples.c08proxy.Subject;

class ConcreteSubject1 extends Subject {
    @Override
    public void doSomeWork() {
        System.out.println("The doSomeWork() is executed");
    }
}
