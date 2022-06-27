package learn.dp.jdpexamples.c22state;

class MuteState implements PossibleState {

    public MuteState() {
        System.out.println("The TV is Mute now.");
    }

    @Override
    public void pressOnButton(TV tvContext) {
        System.out.println("The TV was mute. Going from Mute to On state.");
        tvContext.setCurrentState(new OnState());
    }

    @Override
    public void pressOffButton(TV tvContext) {
        System.out.println("The TV was mute. Going from Mute to Off state.");
        tvContext.setCurrentState(new OffState());
    }

    @Override
    public void pressMuteButton(TV tvContext) {
        System.out.println("The TV was already in Mute state.");
        System.out.println(" So, ignoring this operation.");
    }

    @Override
    public String toString() {
        return " Mute mode.";
    }
}
