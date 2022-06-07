package learn.dp.jdpexamples.c01solid.dip.solution;

public class OracleDatabase implements Database {

    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The ID: " + empId + " is saved in the Oracle database");
    }
}
