package learn.dp.jdpexamples.c17chainofresponsibility;

class UnknownErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handleMessage(Message message) {
        if (!(message.getText().contains("fax") || message.getText().contains("email"))) {
            System.out.println("Unknown error occurs. Consult experts immediately");
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message);
        }
    }

    @Override
    public void setNextErrorHandler(Handler nextReceiver) {
        nextHandler = nextReceiver;
    }
}
