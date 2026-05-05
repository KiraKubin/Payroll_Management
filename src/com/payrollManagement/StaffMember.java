//Name: Shakira McCubbin
//ID: 1600226186

package com.payrollManagement;

public abstract class StaffMember {
    protected String firstName;
    protected String lastName;
    protected String deptNumber;
    protected double hoursWorked;

    public StaffMember(String firstName, String lastName, String deptNumber, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    public void display() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Department: " + deptNumber);
        System.out.println("Hours Worked: " + hoursWorked);
    }

    public abstract double calculateSalary();
}
