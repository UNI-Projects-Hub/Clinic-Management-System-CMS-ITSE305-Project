package domain;

import java.time.LocalDate;

/** Entity representing a medical record/report for a patient. */
public class MedicalRecord {
    private final int recordId;
    private final int patientId;
    private final LocalDate date;
    private final String summary;
    private final String notes;

    public MedicalRecord(int recordId, int patientId, LocalDate date, String summary, String notes) {
        if (date == null) {
            throw new IllegalArgumentException("date must not be null");
        }
        if (summary == null || summary.isBlank()) {
            throw new IllegalArgumentException("summary must not be null or blank");
        }
        // notes can be optional, but we still prevent null to simplify logic
        this.recordId = recordId;
        this.patientId = patientId;
        this.date = date;
        this.summary = summary;
        this.notes = notes == null ? "" : notes;
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
        return "Record #" + recordId + " | Patient #" + patientId +
                " | Date: " + date + " | Summary: " + summary +
                (notes.isBlank() ? "" : " | Notes: " + notes);
    }
}
