package com.clinic.provideMedicine;



import java.util.Scanner;

/**
 * Presentation Layer Class
 * This class represents the user interface for the pharmacist.
 * It interacts with the Business layer and displays the result on the console.
 */
public class Presentation {

    private Business business;

    /**
     * Constructor initializes the Business layer.
     */
    public Presentation() {
        business = new Business();
    }

    /**
     * Displays the main process of providing medicine to the patient.
     * This simulates the pharmacist checking and dispensing medicine.
     */
    public void startProcess() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Provide Medicine System ======");
        System.out.println("Enter Prescription ID (any number to continue): ");
        scanner.nextLine(); // We don't validate the ID since it's a simulation.

        System.out.println("\nChecking prescription...");
        String requiredMedicine = business.getPrescriptionMedicine();
        System.out.println("Prescription requires: " + requiredMedicine);

        System.out.println("\nChecking medicine availability...");
        if (business.isMedicineAvailable()) {
            System.out.println("Status: Medicine is available.");
        } else {
            System.out.println("Status: Medicine is NOT available.");
        }

        System.out.println("\nDispensing...");
        String result = business.dispenseMedicine();
        System.out.println(result);

        System.out.println("\n====== Process Completed ======");
    }

    /**
     * Main method to run the program.
     */
    public static void main(String[] args) {
        Presentation ui = new Presentation();
        ui.startProcess();
    }
}

