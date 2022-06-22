package learn.dp.jdpexamples.c17chainofresponsibility;

class Client {
    public static void main(String[] args) {
        System.out.println("*** Chain or Responsibility Pattern Demo. ***");

        Handler faxHandler = new FaxErrorHandler();
        Handler emailHandler = new EmailErrorHandler();
        Handler unknownHandler = new UnknownErrorHandler();

        Handler rootHandler;
        // Making chain: Fax -> Email -> Unknown -> End
        rootHandler = faxHandler;
        rootHandler.setNextErrorHandler(emailHandler);
        emailHandler.setNextErrorHandler(unknownHandler);
        unknownHandler.setNextErrorHandler(null);

        Message msg1 = new Message("The fax if going slow.");
        Message msg2 = new Message("The emails are not reaching destinations");
        Message msg3 = new Message("Sometimes the BCC field is disabled in emails");
        Message msg4 = new Message("The fax is not reaching destinations.");
        Message msg5 = new Message("Neither email nor fax is working properly.");
        Message msg6 = new Message("Users cannot login into the system.");

        System.out.println("Handling different types of errors.");
        System.out.println("\nError-1");
        rootHandler.handleMessage(msg1);
        System.out.println("\nError-2");
        rootHandler.handleMessage(msg2);
        System.out.println("\nError-3");
        rootHandler.handleMessage(msg3);
        System.out.println("\nError-4");
        rootHandler.handleMessage(msg4);
        System.out.println("\nError-5");
        rootHandler.handleMessage(msg5);
        System.out.println("\nError-6");
        rootHandler.handleMessage(msg6);
    }
}
