package learn.dp.jdpexamples.c17chainofresponsibility;

class EmailErrorHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handleMessage(Message message) {
        if (message.getText().contains("email")) {
            // Error message contains both 'fax' and 'email'
            if (message.getText().contains("fax")) {
                System.out.println("-EmailErrorHandler fixed the email issue: " + message.getText());
                System.out.println("--Now FaxErrorHandler needs to cross verify it.");
                if (nextHandler != null) {
                    nextHandler.handleMessage(message);
                }
            }
            // It's a email error only
            else {
                System.out.println("EmailErrorHandler processed the issue: " + message.getText());
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
