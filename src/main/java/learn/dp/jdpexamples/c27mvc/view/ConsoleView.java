package learn.dp.jdpexamples.c27mvc.view;

import learn.dp.jdpexamples.c27mvc.model.Employee;

import java.util.List;

public class ConsoleView implements View {
    @Override
    public void showEnrolledEmployees(List<Employee> employees) {
        System.out.println("\n ***This is a console view of currently enrolled employees.*** ");
        employees.forEach(System.out::println);
        System.out.println("---------------------");
    }
}
