package learn.dp.jdpexamples.c17chainofresponsibility;

class FaxErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handleMessage(Message message) {
        if (message.getText().contains("fax")) {
            // Error message contains both 'fax' and 'email'
            if (message.getText().contains("email")) {
                System.out.println("-FaxErrorHandler fixed the fax issue: " + message.getText());
                System.out.println("--Now EmailErrorHandler needs to cross verify it.");
                if (nextHandler != null) {
                    nextHandler.handleMessage(message);
                }
            }
            // It's a fax error only
            else {
                System.out.println("FaxErrorHandler processed the issue: " + message.getText());
            }
        }
        else {
            if (nextHandler != null) {
                nextHandler.handleMessage(message);
            }
        }
    }

    @Override
    public void setNextErrorHandler(Handler nextReceiver) {
        nextHandler = nextReceiver;
    }
}
