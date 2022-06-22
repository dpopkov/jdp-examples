package learn.dp.jdpexamples.c17chainofresponsibility;

interface Handler {

    void handleMessage(Message message);

    void setNextErrorHandler(Handler nextReceiver);
}
