package presentation;

import java.util.Scanner;
import business.PatientService;
import data.PatientDAO;
import models.Patient;

// Presentation Layer (UI Layer)
// Responsible for interacting with the user
public class PatientUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create objects for DAO and Service
        PatientDAO patientDAO = new PatientDAO();
        PatientService service = new PatientService(patientDAO);

        System.out.println("=== Update Contact Information ===");

        // Ask user for patient ID
        System.out.print("Enter your patient ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        // Fetch patient data
        Patient patient = service.getPatient(id);

        // If no patient found, exit
        if (patient == null) {
            System.out.println("Patient not found.");
            scanner.close();
            return;
        }

        // Display current info
        System.out.println("\nCurrent Contact Info:");
        System.out.println(patient);

        // Ask for new contact info
        System.out.print("\nEnter new email: ");
        String email = scanner.nextLine();

        System.out.print("Enter new phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter new address: ");
        String address = scanner.nextLine();

        // Attempt update
        boolean success = service.updateContactInfo(id, email, phone, address);

        // Show result
        if (success) {
            System.out.println("\n✅ Contact information updated successfully!");
            System.out.println(service.getPatient(id));
        } else {
            System.out.println("\n❌ Failed to update contact information.");
        }

        scanner.close();
    }
}
