package learn.dp.jdpexamples.c01solid.dip.solution;

public class UserInterface {
    private Database database;

    public UserInterface(Database database) {
        this.database = database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void saveEmployeeId(String empId) {
        database.saveEmpIdInDatabase(empId);
    }
}
