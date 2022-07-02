package learn.dp.jdpexamples.c26nullobject.demo1;

import java.util.Scanner;

class NeedForNullObjectPattern {

    public static void main(String[] args) {
        System.out.println("*** This program demonstrates the need for a Null Object pattern. ***");

        Scanner in = new Scanner(System.in);
        Vehicle vehicle = null;
        boolean travelling = true;
        while (travelling) {
            System.out.println("Enter your choice ('b' for Bus, 't' for Train):");
            String input = in.nextLine();
            switch (input) {
                case "b":
                    vehicle = new Bus();
                    vehicle.travel();
                    break;
                case "t":
                    vehicle = new Train();
                    vehicle.travel();
                    break;
                case "exit":
                    travelling = false;
                    System.out.println("Closing the application.");
                    break;
                default:
                    System.out.println("Invalid input.");
                    System.out.println("Using the vehicle that was created earlier");
                    vehicle.travel();
                    break;
            }
            System.out.println("Number of objects created: " + (Bus.getBusCount() + Train.getTrainCount()));
        }
    }
}
