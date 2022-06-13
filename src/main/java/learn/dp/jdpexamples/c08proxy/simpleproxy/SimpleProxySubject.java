package learn.dp.jdpexamples.c08proxy.simpleproxy;

import learn.dp.jdpexamples.c08proxy.Subject;

public class SimpleProxySubject extends Subject {
    private final Subject subject;

    public SimpleProxySubject() {
        subject = new ConcreteSubject1();
    }

    @Override
    public void doSomeWork() {
        System.out.println("Proxy call is happening now.");
        subject.doSomeWork();
    }
}
