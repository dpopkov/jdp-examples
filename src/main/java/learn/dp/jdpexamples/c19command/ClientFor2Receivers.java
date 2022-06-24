package learn.dp.jdpexamples.c19command;

class ClientFor2Receivers {

    public static void main(String[] args) {
        System.out.println("*** Command Pattern Demo 2. ***");

        GameReceiver golfReceiver = new GameReceiver("Golf");
        Command startGolf = new GameStartCommand(golfReceiver);
        Command stopGolf = new GameStopCommand(golfReceiver);
        final var invoker = new RemoteControlUndoAllInvoker();

        System.out.println("\n--- Testing the Game Scenario ---");
        System.out.println("Issuing the Start command");
        invoker.setCommand(startGolf).executeCommand();
        System.out.println("Issuing the Stop command");
        invoker.setCommand(stopGolf).executeCommand();
        System.out.println("Undoing the last command");
        invoker.undoCommand();

        System.out.println("\n--- Testing the Numbers Scenario ---");

        NumberGeneratorReceiver generatorReceiver = new NumberGeneratorReceiver();
        System.out.println("We'll test a series of do/undo operations now.");
        System.out.println("Incrementing a number 3 times");
        AdditionCommand addNumber = new AdditionCommand(generatorReceiver);
        invoker.setCommand(addNumber).executeCommand();
        invoker.executeCommand();
        invoker.executeCommand();
        System.out.println("Undoing the last command only");
        invoker.undoCommand();

        System.out.println("Undoing all commands");
        invoker.undoAllCommands();
        invoker.undoCommand();
    }
}
