package learn.dp.jdpexamples.c08proxy.protectionproxy;

import learn.dp.jdpexamples.c08proxy.ProtectedSubject;

class ConcreteSubject2 extends ProtectedSubject {
    @Override
    public void doSomeWork(String user) {
        System.out.println(user + " invokes the doSomeWork()");
    }
}
