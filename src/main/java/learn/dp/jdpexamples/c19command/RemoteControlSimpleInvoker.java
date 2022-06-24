package learn.dp.jdpexamples.c19command;

class RemoteControlSimpleInvoker implements Invoker {
    private Command currentCommand;
    private Command previousCommand;

    @Override
    public RemoteControlSimpleInvoker setCommand(Command command) {
        this.currentCommand = command;
        previousCommand = null;
        return this;
    }

    @Override
    public void executeCommand() {
        currentCommand.execute();
        previousCommand = currentCommand;
    }

    @Override
    public void undoCommand() {
        if (previousCommand != null) {
            previousCommand.undo();
        } else {
            System.out.println("There is no command to undo.");
        }
    }
}
