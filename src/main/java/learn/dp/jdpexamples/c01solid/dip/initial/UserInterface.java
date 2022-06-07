package learn.dp.jdpexamples.c01solid.dip.initial;

/*
The program suffers from the following issues:

1) The top-level class UserInterface has too much dependency on the bottom-level class OracleDatabase.
These two classes are tightly coupled.
If the OracleDatabase class changes (for example, when you change the signature of the saveEmpIdInDatabase() method),
you need to adjust the UserInterface class.

2) The low-level class should be available before you write the top-level class.
So, you are forced to complete the low-level class before you write or test the high-level class.

3) What if you use a different database?
For example, you may want to switch from the Oracle database to a MySQL database or you may need to support both.
 */
public class UserInterface {
    private final OracleDatabase oracleDatabase;

    public UserInterface() {
        oracleDatabase = new OracleDatabase();
    }

    public void saveEmployeeId(String empId) {
        oracleDatabase.saveEmpIdInDatabase(empId);
    }
}
