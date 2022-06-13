package learn.dp.jdpexamples.c08proxy;

import learn.dp.jdpexamples.c08proxy.simpleproxy.SimpleProxySubject;

class ClientSimple {

    public static void main(String[] args) {
        System.out.println("*** Proxy Pattern Demo 1 - Simple. ***");
        Subject proxy = new SimpleProxySubject();
        proxy.doSomeWork();
    }
}
