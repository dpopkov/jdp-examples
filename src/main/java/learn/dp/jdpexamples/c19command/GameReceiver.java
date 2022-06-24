package learn.dp.jdpexamples.c19command;

class GameReceiver {
    private final String gameName;

    GameReceiver(String gameName) {
        this.gameName = gameName;
    }

    public void start() {
        System.out.println(gameName + " is on.");
    }

    public void displayScore() {
        System.out.println("The score is changing from time to time.");
    }

    public void stop() {
        System.out.println(gameName + " is stopped.");
    }
}
