package learn.dp.jdpexamples.c22state;

class TV {

    private PossibleState currentState;

    public TV() {
        currentState = new OffState();
    }

    public PossibleState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PossibleState currentState) {
        this.currentState = currentState;
    }

    public void executeOffButton() {
        System.out.println("You pressed the Off button");
        // Delegating the state behavior
        currentState.pressOffButton(this);
    }

    public void executeOnButton() {
        System.out.println("You pressed the On button");
        // Delegating the state behavior
        currentState.pressOnButton(this);
    }

    public void executeMuteButton() {
        System.out.println("You pressed the Mute button");
        // Delegating the state behavior
        currentState.pressMuteButton(this);
    }

    public void printState() {
        System.out.printf("Current state: %s%n%n", getCurrentState());
    }
}
