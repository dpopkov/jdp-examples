package learn.dp.jdpexamples.c22state;

class Client {

    public static void main(String[] args) {
        System.out.println("*** State Pattern Demo. ***");

        TV tv = new TV();
        System.out.println("User is pressing buttons in the following sequence:");
        System.out.println("Off->Mute->On->On->Mute->Mute->On->Off\n");

        tv.executeOffButton();
        tv.executeMuteButton();
        tv.printState();

        tv.executeOnButton();
        tv.printState();

        tv.executeOnButton();
        tv.executeMuteButton();
        tv.executeMuteButton();
        tv.printState();

        tv.executeOnButton();
        tv.executeOffButton();
        tv.printState();
    }
}
