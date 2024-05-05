import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 5500, 1);
        Worker worker2 = new Worker("Jane", 6000, 2);
        Worker worker3 = new Worker("Michael", 5000, 3);
        Worker worker4 = new Worker("Eve", 7000, 4);

        Manager manager = new Manager("George", 10000, 5);

        System.out.println("Salary of worker1: " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary of worker2: " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary of worker3: " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary of worker4: " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of manager: " + manager.getSalary());
        manager.work();
    }
}