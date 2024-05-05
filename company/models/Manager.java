package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {
    private String hireDate;
    private String position;

    
    public Manager(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id);
        this.hireDate = hireDate;
        this.position = position;
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }
}