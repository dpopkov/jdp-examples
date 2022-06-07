package learn.dp.jdpexamples.c01solid.dip.solution;

public class MySqlDatabase implements Database {

    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The ID: " + empId + " is saved in the MySQL database");
    }
}
