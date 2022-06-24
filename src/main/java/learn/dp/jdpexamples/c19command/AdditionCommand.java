package learn.dp.jdpexamples.c19command;

class AdditionCommand implements Command {
    private final NumberGeneratorReceiver numberGenerator;

    AdditionCommand(NumberGeneratorReceiver numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @Override
    public void execute() {
        numberGenerator.increment();
    }

    @Override
    public void undo() {
        numberGenerator.decrement();
    }
}
