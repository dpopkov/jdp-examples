package learn.dp.jdpexamples.c27mvc.controller;

import learn.dp.jdpexamples.c27mvc.model.Employee;
import learn.dp.jdpexamples.c27mvc.model.Model;
import learn.dp.jdpexamples.c27mvc.view.View;

public abstract class Controller {

    protected Model model;
    protected View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public abstract void displayEnrolledEmployees();

    public abstract void addEmployee(Employee employee);

    public abstract void removeEmployee(String employeeId);
}
