import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Worker worker1 = new Worker("John", 5500, 1, "2020-01-10", "Software Developer");
        Worker worker2 = new Worker("Jane", 6000, 2, "2020-02-15", "Senior Developer");
        Worker worker3 = new Worker("Michael", 5000, 3, "2020-03-20", "Tester");
        Worker worker4 = new Worker("Eve", 7000, 4, "2020-04-25", "Product Manager");

        
        Manager manager = new Manager("George", 10000, 5, "2019-11-01", "Department Head");

        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        
        for (Employee employee : employees) {
            employee.work();
            System.out.println("-" + employee.getName() +
                               " (ID: " + employee.getId() +
                               ", Position: " + employee.getPosition() +
                               ", Hire date: " + employee.getHireDate() +
                               ", Salary: " + employee.getSalary() + ")");
        }
    }
}