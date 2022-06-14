package learn.dp.jdpexamples.c09decorator;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Using Decorators in different scenarios. ***");

        System.out.println("\nScenario-1: Making a basic home with standard facilities.");
        Home home = new BasicHome();
        home.printTotal();

        System.out.println("\nScenario-2: Making a basic home. Then adding a playground.");
        home = new BasicHome();
        home.printTotal();
        home = new PlayGround(home);
        home.printTotal();

        System.out.println("\nScenario-3: Making a basic home. Then adding two playgrounds.");
        home = new BasicHome();
        home.printTotal();
        home = new PlayGround(home);
        home.printTotal();
        home = new PlayGround(home);
        home.printTotal();

        System.out.println("\nScenario-4: Making a basic home. Then adding a playground and a swimming pool.");
        home = new BasicHome();
        home.printTotal();
        home = new PlayGround(home);
        home.printTotal();
        home = new SwimmingPool(home);
        home.printTotal();

        System.out.println("\nScenario-5: Making a basic home. Then adding a swimming pool and a playground.");
        home = new BasicHome();
        home.printTotal();
        home = new SwimmingPool(home);
        home.printTotal();
        home = new PlayGround(home);
        home.printTotal();

        System.out.println("\nScenario-6: Making an advanced home.");
        home = new AdvancedHome();
        home.printTotal();

        System.out.println("\nScenario-7: Making an advanced home. Then adding a playground.");
        home = new AdvancedHome();
        home.printTotal();
        home = new PlayGround(home);
        home.printTotal();

        System.out.println("\nScenario-8: Making an advanced home. Then adding a playground and a swimming pool.");
        home = new AdvancedHome();
        home.printTotal();
        home = new PlayGround(home);
        home.printTotal();
        home = new SwimmingPool(home);
        home.printTotal();
    }

}
