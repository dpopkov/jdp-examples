package learn.dp.jdpexamples.c22state;

class OnState implements PossibleState {

    public OnState() {
        System.out.println("The TV is On now.");
    }

    @Override
    public void pressOnButton(TV tvContext) {
        System.out.println("The TV was already in On state.");
        System.out.println(" So, ignoring this operation.");
    }

    @Override
    public void pressOffButton(TV tvContext) {
        System.out.println("The TV was on. Going from On to Off state.");
        tvContext.setCurrentState(new OffState());
    }

    @Override
    public void pressMuteButton(TV tvContext) {
        System.out.println("The TV was on. Going from On to Mute state.");
        tvContext.setCurrentState(new MuteState());
    }

    @Override
    public String toString() {
        return " Switched on.";
    }
}
