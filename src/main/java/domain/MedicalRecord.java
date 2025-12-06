package domain;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Entity representing a medical record/report for a patient.
 * The class is clean, well-structured, and immutable, ensuring safety and ease of use.
 * The toString() method is nicely formatted.
 *
 * Suggestion: Added null checks in the constructor to avoid unexpected null values
 * for required fields like date or summary.
 */
public class MedicalRecord {

    private final int recordId;
    private final int patientId;
    private final LocalDate date;
    private final String summary;
    private final String notes;

    public MedicalRecord(int recordId, int patientId, LocalDate date, String summary, String notes) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.date = Objects.requireNonNull(date, "Date cannot be null");
        this.summary = Objects.requireNonNull(summary, "Summary cannot be null");
        this.notes = notes;
    }

    public int getRecordId() {
        return recordId;
    }

    public int getPatientId() {
        return patientId;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSummary() {
        return summary;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Record #" + recordId +
                " | Patient #" + patientId +
                " | Date: " + date +
                " | Summary: " + summary +
                (notes == null || notes.isBlank() ? "" : " | Notes: " + notes);
    }
}
