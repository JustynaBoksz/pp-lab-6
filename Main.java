import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("John", 5500, 1, "2020-01-10", "Software Developer");
        Worker worker2 = new Worker("Jane", 6000, 1, "2020-02-15", "Senior Developer");
        Worker worker3 = new Worker("Michael", 5000, 2, "2020-03-20", "Tester");
        Worker worker4 = new Worker("Anna", 6500, 2, "2020-05-10", "UI Designer");
        Worker worker5 = new Worker("Bill", 5000, 4, "2020-06-15", "System Analyst");

        Manager manager1 = new Manager("George", 10000, 3, "2019-11-01", "Department Head");
        Manager manager2 = new Manager("Jessica", 10000, 5, "2019-12-01", "Project Manager");
        Manager manager3 = new Manager("Tom", 10000, 5, "2020-01-20", "IT Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        
        double totalSalary = 0;
        double totalWorkerSalary = 0;
        double totalManagerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            } else if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all workers: " + totalWorkerSalary);
        System.out.println("Total salary of all managers: " + totalManagerSalary);

        
        Map<Integer, Integer> idCount = new HashMap<>();
        for (Employee employee : employees) {
            idCount.put(employee.getId(), idCount.getOrDefault(employee.getId(), 0) + 1);
        }

        System.out.println("Employees with duplicate IDs:");
        for (Map.Entry<Integer, Integer> entry : idCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("ID " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }
}