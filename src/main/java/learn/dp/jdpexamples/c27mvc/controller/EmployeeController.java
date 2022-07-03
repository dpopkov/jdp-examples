package learn.dp.jdpexamples.c27mvc.controller;

import learn.dp.jdpexamples.c27mvc.model.Employee;
import learn.dp.jdpexamples.c27mvc.model.Model;
import learn.dp.jdpexamples.c27mvc.view.View;

import java.util.List;

public class EmployeeController extends Controller {

    public EmployeeController(Model model, View view) {
        super(model, view);
    }

    @Override
    public void displayEnrolledEmployees() {
        List<Employee> employees = model.getEnrolledEmployees();
        view.showEnrolledEmployees(employees);
    }

    @Override
    public void addEmployee(Employee employee) {
        model.addEmployee(employee);
    }

    @Override
    public void removeEmployee(String employeeId) {
        model.removeEmployee(employeeId);
    }
}
