//Name: Shakira McCubbin
//ID: 1600226186

package com.payrollManagement;

public class Manager extends StaffMember{
    private double bonus;

    public Manager(String firstName, String lastName, String deptNumber, double hoursWorked, double bonus) {
        super(firstName, lastName, deptNumber, hoursWorked);
        this.bonus = bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Salary: $" + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * 2500) + bonus;
    }
}
