package learn.dp.jdpexamples.c22state;

class OffState implements PossibleState {

    public OffState() {
        System.out.println("The TV is Off now.");
    }

    @Override
    public void pressOnButton(TV tvContext) {
        System.out.println("The TV was off. Going from Off to On state.");
        tvContext.setCurrentState(new OnState());
    }

    @Override
    public void pressOffButton(TV tvContext) {
        System.out.println("The TV was already in Off state.");
        System.out.println(" So, ignoring this operation.");
    }

    @Override
    public void pressMuteButton(TV tvContext) {
        System.out.println("The TV was already off.");
        System.out.println(" So, ignoring this operation.");
    }

    @Override
    public String toString() {
        return " Switched off.";
    }
}
