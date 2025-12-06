// models/Appointment.java
// This file defines the Appointment class, which represents a scheduled meeting
// between a patient and a doctor, including details such as ID, names, and date/time.

import java.time.LocalDateTime;

public class Appointment {

    private int appointmentId;     // Unique identifier for each appointment.
    private String patientName;    // The name of the patient who booked the appointment.
    private String doctorName;     // The name of the doctor assigned to the appointment.
    private LocalDateTime dateTime; // The date and time when the appointment is scheduled.

    // Constructor to initialize all fields when creating a new Appointment object,
    // including validation to prevent null or empty values.
    public Appointment(int appointmentId, String patientName, String doctorName, LocalDateTime dateTime) {

        if (patientName == null || patientName.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient name cannot be null or empty.");
        }

        if (doctorName == null || doctorName.trim().isEmpty()) {
            throw new IllegalArgumentException("Doctor name cannot be null or empty.");
        }

        if (dateTime == null) {
            throw new IllegalArgumentException("Appointment date/time cannot be null.");
        }

        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.dateTime = dateTime;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId +
                "\nPatient: " + patientName +
                "\nDoctor: " + doctorName +
                "\nDate/Time: " + dateTime;
    }
}
