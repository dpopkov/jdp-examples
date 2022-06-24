package learn.dp.jdpexamples.c19command;

class GameStartCommand implements Command {

    private final GameReceiver gameReceiver;

    public GameStartCommand(GameReceiver game) {
        this.gameReceiver = game;
    }

    @Override
    public void execute() {
        System.out.println("The game is about to start.");
        gameReceiver.start();
        gameReceiver.displayScore();
    }

    @Override
    public void undo() {
        System.out.println("Undoing the last \"Start\" command.");
        gameReceiver.stop();
    }
}
