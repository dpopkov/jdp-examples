package learn.dp.jdpexamples.c08proxy;

import learn.dp.jdpexamples.c08proxy.protectionproxy.ProtectionProxySubject;

class ClientProtection {

    public static void main(String[] args) {
        System.out.println("*** Proxy Pattern Demo 2 - Protection. ***");
        ProtectedSubject proxy = new ProtectionProxySubject();
        proxy.doSomeWork("Admin");
        proxy.doSomeWork("Guest");
    }
}
