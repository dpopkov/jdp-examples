package learn.dp.jdpexamples.c27mvc;

import learn.dp.jdpexamples.c27mvc.controller.Controller;
import learn.dp.jdpexamples.c27mvc.controller.EmployeeController;
import learn.dp.jdpexamples.c27mvc.model.Employee;
import learn.dp.jdpexamples.c27mvc.model.EmployeeModel;
import learn.dp.jdpexamples.c27mvc.model.Model;
import learn.dp.jdpexamples.c27mvc.view.ConsoleView;
import learn.dp.jdpexamples.c27mvc.view.View;

class Client {

    public static void main(String[] args) {
        System.out.println("*** MVC architecture Demo. ***");

        Model model = new EmployeeModel();
        View view = new ConsoleView();
        Controller controller = new EmployeeController(model, view);
        controller.displayEnrolledEmployees();

        Employee kevin=new Employee("Kevin", "E4");
        controller.addEmployee(kevin);
        controller.displayEnrolledEmployees();

        controller.removeEmployee("E5");
        controller.displayEnrolledEmployees();

        controller.addEmployee(kevin);
        controller.addEmployee(new Employee("Kate", "E4"));
    }
}
