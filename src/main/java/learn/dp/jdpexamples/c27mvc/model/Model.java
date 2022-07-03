package learn.dp.jdpexamples.c27mvc.model;

import java.util.List;

public interface Model {

    List<Employee> getEnrolledEmployees();

    void addEmployee(Employee employee);

    void removeEmployee(String employeeId);
}
