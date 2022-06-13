package learn.dp.jdpexamples.c08proxy.protectionproxy;

import learn.dp.jdpexamples.c08proxy.ProtectedSubject;

import java.util.List;

public class ProtectionProxySubject extends ProtectedSubject {
    private final ProtectedSubject subject;
    private final List<String> registeredUsers = List.of("Admin", "Alice", "Bob");

    public ProtectionProxySubject() {
        subject = new ConcreteSubject2();
    }

    @Override
    public void doSomeWork(String user) {
        System.out.println("Proxy call is happening now.");
        System.out.println(user + " wants to invoke a proxy method.");
        if (registeredUsers.contains(user)) {
            subject.doSomeWork(user);
        } else {
            System.out.println("Sorry, " + user + ", you do not have access rights");
        }
    }
}
