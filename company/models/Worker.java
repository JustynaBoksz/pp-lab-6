package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {
    private String hireDate;
    private String position;

    
    public Worker(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id);
        this.hireDate = hireDate;
        this.position = position;
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }

    
    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }
}