package presentation;

import java.util.Scanner;

import business.PatientService;
import data.PatientDAO;
import models.Patient;

public class PatientUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PatientDAO patientDAO = new PatientDAO();
        PatientService service = new PatientService(patientDAO);

        System.out.println("=== Update Contact Information ===");

        Patient patient = null;
        int id = -1;

        // Loop until a valid patient is found
        while (patient == null) {
            System.out.print("Enter your patient ID: ");
            String input = scanner.nextLine();

            try {
                id = Integer.parseInt(input);
                patient = service.getPatient(id).orElse(null);

                if (patient == null) {
                    System.out.println("Patient not found. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID. Please enter a numeric value.");
            }
        }

        // Display current info
        System.out.println("\nCurrent Contact Info:");
        System.out.println(patient);

        // Input loop for new contact info
        String email, phone, address;
        while (true) {
            System.out.print("\nEnter new email: ");
            email = scanner.nextLine();
            System.out.print("Enter new phone: ");
            phone = scanner.nextLine();
            System.out.print("Enter new address: ");
            address = scanner.nextLine();

            if (email.isBlank() || phone.isBlank() || address.isBlank()) {
                System.out.println("Fields cannot be empty. Please enter all values.");
            } else {
                break;
            }
        }



        

        // Attempt update
        boolean success = service.updateContactInfo(id, email, phone, address);

        if (success) {
            System.out.println("\n✅ Contact information updated successfully!");
            System.out.println(service.getPatient(id).get());
        } else {
            System.out.println("\n❌ Failed to update contact information.");
        }

        scanner.close();
    }
}
