package learn.dp.jdpexamples.c01solid.dip.solution;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo with DIP. ***");
        UserInterface userInterface = new UserInterface(new OracleDatabase());
        userInterface.saveEmployeeId("EMP001");

        userInterface.setDatabase(new MySqlDatabase());
        userInterface.saveEmployeeId("EMP002");
    }
}
