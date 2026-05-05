//Name: Shakira McCubbin
//ID: 1600226186

package com.payrollManagement;

public class SalesRep extends StaffMember{
    private double allowance;

    public SalesRep(String firstName, String lastName, String deptNumber, double hoursWorked, double allowance) {
        super(firstName, lastName, deptNumber, hoursWorked);
        this.allowance = allowance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Allowance: $" + allowance);
        System.out.println("Salary: $" + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked * 1500) + allowance;
    }

    public double getAllowance() { return allowance; }
}
