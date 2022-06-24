package learn.dp.jdpexamples.c19command;

class ClientFor1Game {

    public static void main(String[] args) {
        System.out.println("*** Command Pattern Demo 1. ***");

        GameReceiver tennisReceiver = new GameReceiver("Tennis");
        Command startTennis = new GameStartCommand(tennisReceiver);
        Command stopTennis = new GameStopCommand(tennisReceiver);
        Invoker invoker = new RemoteControlSimpleInvoker();

        System.out.println("\n--- Testing Scenario 1 ---");
        System.out.println("Issuing the Start command");
        invoker.setCommand(startTennis).executeCommand();
        System.out.println("Undoing the last command");
        invoker.undoCommand();

        System.out.println("\n--- Testing Scenario 2 ---");
        System.out.println("Issuing the Start command");
        invoker.setCommand(startTennis).executeCommand();
        System.out.println("Issuing the Stop command");
        invoker.setCommand(stopTennis).executeCommand();
        System.out.println("Undoing the stopping of the game");
        invoker.undoCommand();
    }
}
