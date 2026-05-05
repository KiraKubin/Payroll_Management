//Name: Shakira McCubbin
//ID: 1600226186

package com.payrollManagement;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Payroll {
    public static void main(String[] args) {

        // --- Part 2: Polymorphism Demo ---
        System.out.println("===== PAYROLL SYSTEM =====\n");

        StaffMember[] staff = {
                new Manager("Alice", "Johnson", "MGT-01", 160, 5000),
                new SalesRep("Bob", "Smith", "SLS-02", 120, 1500)
        };

        for (StaffMember member : staff) {
            member.display();  // Polymorphic call
            System.out.println("--------------------------");
        }

        // --- Part 4: ArrayList of SalesReps ---
        System.out.println("\n===== SALES TEAM =====\n");

        ArrayList<SalesRep> salesTeam = new ArrayList<>();
        salesTeam.add(new SalesRep("Carol",  "Davis",   "SLS-01", 100, 1200));
        salesTeam.add(new SalesRep("David",  "Martinez","SLS-02", 110, 1300));
        salesTeam.add(new SalesRep("Eve",    "Wilson",  "SLS-03", 95,  1100));
        salesTeam.add(new SalesRep("Frank",  "Anderson","SLS-04", 130, 1600));
        salesTeam.add(new SalesRep("Grace",  "Taylor",  "SLS-05", 105, 1400));

        for (SalesRep rep : salesTeam) {
            rep.display();
            System.out.println("Calculated Salary: $" + rep.calculateSalary());
            System.out.println("--------------------------");
        }

        // --- Part 5: Write Paystubs.txt ---
        try (PrintWriter writer = new PrintWriter(new FileWriter("Paystubs.txt"))) {
            writer.println("========== PAYSTUBS ==========");
            writer.println();

            // Write all staff members
            for (StaffMember member : staff) {
                writer.println("Name: " + member.firstName + " " + member.lastName);
                writer.println("Department ID: " + member.deptNumber);
                writer.println("Final Salary: $" + member.calculateSalary());
                writer.println("------------------------------");
            }

            // Write sales team
            int id = 1;
            for (SalesRep rep : salesTeam) {
                writer.println("Name: " + rep.firstName + " " + rep.lastName);
                writer.println("Employee ID: SLS-0" + id++);
                writer.println("Final Salary: $" + rep.calculateSalary());
                writer.println("------------------------------");
            }

            System.out.println("\nPaystubs.txt generated successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}