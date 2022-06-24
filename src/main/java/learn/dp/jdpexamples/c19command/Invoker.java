package learn.dp.jdpexamples.c19command;

interface Invoker {

    Invoker setCommand(Command command);

    void executeCommand();

    void undoCommand();
}
