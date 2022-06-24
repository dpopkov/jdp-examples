package learn.dp.jdpexamples.c19command;

class GameStopCommand implements Command {

    private final GameReceiver gameReceiver;

    public GameStopCommand(GameReceiver game) {
        this.gameReceiver = game;
    }

    @Override
    public void execute() {
        System.out.println("Stopping the game");
        gameReceiver.stop();
    }

    @Override
    public void undo() {
        System.out.println("Undoing the last \"Stop\" command.");
        gameReceiver.start();
        gameReceiver.displayScore();
    }
}
