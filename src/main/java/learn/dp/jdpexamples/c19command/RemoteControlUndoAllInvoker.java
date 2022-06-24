package learn.dp.jdpexamples.c19command;

import java.util.ArrayDeque;
import java.util.Deque;

class RemoteControlUndoAllInvoker implements Invoker {
    private Command currentCommand;
    private final Deque<Command> history = new ArrayDeque<>();

    @Override
    public RemoteControlUndoAllInvoker setCommand(Command command) {
        this.currentCommand = command;
        return this;
    }

    @Override
    public void executeCommand() {
        currentCommand.execute();
        history.push(currentCommand);
    }

    @Override
    public void undoCommand() {
        if (history.isEmpty()) {
            System.out.println("There is no command to undo.");
        } else {
            undoPrevious();
        }
    }

    public void undoAllCommands() {
        while (!history.isEmpty()) {
            undoPrevious();
        }
    }

    private void undoPrevious() {
        Command previousCommand = history.pop();
        previousCommand.undo();
    }
}
