package learn.dp.jdpexamples.c27mvc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeModel implements Model {

    private final List<Employee> enrolled = new ArrayList<>();

    public EmployeeModel() {
        enrolled.add(new Employee("Alice", "E1"));
        enrolled.add(new Employee("Bob", "E2"));
        enrolled.add(new Employee("Sam", "E3"));
    }

    @Override
    public List<Employee> getEnrolledEmployees() {
        return enrolled;
    }

    @Override
    public void addEmployee(Employee employee) {
        System.out.println("\nTrying to add an employee: " + employee);
        Optional<Employee> found = findById(employee.getId());
        if (found.isPresent()) {
            System.out.println("FAILED! Duplicate ID.");
            System.out.println(employee.getId() + " is already added to the system.");
        } else {
            enrolled.add(employee);
            System.out.println(employee + " is added now.");
        }
    }

    @Override
    public void removeEmployee(String employeeId) {
        System.out.println("\nTrying to remove an employee by id " + employeeId);
        Optional<Employee> found = findById(employeeId);
        if (found.isPresent()) {
            System.out.println("Removing this employee.");
            enrolled.remove(found.get());
        } else {
            System.out.println("There is no employee with id " + employeeId);
            System.out.println("This request is ignored");
        }
    }

    private Optional<Employee> findById(String id) {
        return enrolled.stream().filter(e -> e.getId().equals(id)).findFirst();
    }
}
