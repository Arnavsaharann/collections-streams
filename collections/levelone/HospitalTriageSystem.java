package com.bridgelabz.collections.levelone;

import java.lang.reflect.Parameter;
import java.util.*;


public class HospitalTriageSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.getSeverity(), p1.getSeverity()));

        System.out.print("Enter number of patients: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter patient name: ");
            String name = scanner.nextLine();
            System.out.print("Enter severity level (higher is more critical): ");
            int severity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            triageQueue.add(new Patient(name, severity));
        }

        System.out.println("\nPatients will be treated in the following order:");
        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            p.printDetails();
        }
    }
}

class Patient{
    private String name;
    private int severity;


    public Patient(String name, int severity){
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public void printDetails(){
        System.out.println("Patient: " + name + ", Severity: " + severity);
    }
}
