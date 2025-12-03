package presentation;

import business.MedicalRecordService;
import data.MedicalRecordRepository;
import domain.MedicalRecord;
import domain.Patient;

import java.util.List;
import java.util.Scanner;

/** Console UI (presentation layer) for the doctor to view medical records. */
public class MedicalRecordUI {

    private final MedicalRecordService service;
    private final Scanner scanner = new Scanner(System.in);

    public MedicalRecordUI(MedicalRecordService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        MedicalRecordRepository repo = new MedicalRecordRepository();
        MedicalRecordService service = new MedicalRecordService(repo);
        new MedicalRecordUI(service).run();
    }

    private void run() {
        System.out.println("== Doctor Portal: View Medical Records ==");
        while (true) {
            String input = readLine("\nEnter Patient ID (or 'exit'): ");
            if (input.equalsIgnoreCase("exit"))
                break;

            try {
                int patientId = Integer.parseInt(input);
                handlePatientSession(patientId);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a numeric Patient/Record ID.");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Goodbye.");
        scanner.close();
    }

    /**
     * Handles the full flow for a single patient: lookup, search, and optional
     * record details.
     */
    private void handlePatientSession(int patientId) {
        Patient p = service.requirePatient(patientId);
        System.out.println("Patient: " + p.getFullName() + " (ID " + p.getId() + ")");

        String term = readLine("Search term (press Enter to list all): ");
        List<MedicalRecord> list = service.searchRecords(patientId, term);

        if (list.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        displayRecords(list);
        promptForRecordDetails();
    }

    private void displayRecords(List<MedicalRecord> records) {
        System.out.println("\nRecords:");
        records.forEach(r -> System.out.println(" - " + r));
    }

    private void promptForRecordDetails() {
        String recIn = readLine("\nEnter Record ID to view details (or Enter to skip): ").trim();
        if (recIn.isBlank()) {
            return;
        }

        try {
            int rid = Integer.parseInt(recIn);
            showRecordDetails(rid);
        } catch (NumberFormatException ex) {
            System.out.println("Please enter a numeric Record ID.");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void showRecordDetails(int recordId) {
        MedicalRecord r = service.getRecord(recordId);
        System.out.println("\n=== Record Details ===");
        System.out.println(r);
    }

    private String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    public List<MedicalRecord> searchInPatientRecords(int patientId, String term) {
        String lowerTerm = term.toLowerCase();
        return recordsByPatient.getOrDefault(patientId, Collections.emptyList())
                .stream()
                .filter(r -> r.getSummary().toLowerCase().contains(lowerTerm) ||
                        r.getNotes().toLowerCase().contains(lowerTerm))
                .sorted(Comparator.comparing(MedicalRecord::getDate).reversed())
                .collect(Collectors.toList());
    }
}