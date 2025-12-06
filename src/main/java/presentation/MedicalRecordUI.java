package presentation;

import business.MedicalRecordService;
import domain.MedicalRecord;
import domain.Patient;

import java.util.List;
import java.util.Scanner;

/** Console UI (presentation layer) for the doctor to view medical records. */
public class MedicalRecordUI {

    private final MedicalRecordService service = new MedicalRecordService();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new MedicalRecordUI().run();
    }

    private void run() {
        System.out.println("== Doctor Portal: View Medical Records ==");
        while (true) {
            System.out.print("\nEnter Patient ID (or 'exit'): ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) break;

            try {
                int patientId = Integer.parseInt(input);
                Patient p = service.requirePatient(patientId);
                System.out.println("Patient: " + p.getFullName() + " (ID " + p.getId() + ")");

                System.out.print("Search term (press Enter to list all): ");
                String term = scanner.nextLine();

                List<MedicalRecord> list = service.searchRecords(patientId, term);
                if (list.isEmpty()) {
                    System.out.println("No records found.");
                    continue;
                }

                System.out.println("\nRecords:");
                list.forEach(r -> System.out.println(" - " + r));

                System.out.print("\nEnter Record ID to view details (or Enter to skip): ");
                String recIn = scanner.nextLine().trim();
                if (!recIn.isBlank()) {
                    int rid = Integer.parseInt(recIn);
                    MedicalRecord r = service.getRecord(rid);
                    System.out.println("\n=== Record Details ===");
                    System.out.println(r);
                }
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a numeric Patient/Record ID.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Goodbye.");
    }
}
