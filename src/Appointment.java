// models/Appointment.java
// This file defines the Appointment class, which represents a scheduled meeting
// between a patient and a doctor, including details such as ID, names, and date/time.

import java.time.LocalDateTime;
// Importing the LocalDateTime class from the java.time package to handle date and time information.

public class Appointment {
    // Class definition for Appointment. It represents a single appointment record.


    private int appointmentId;
    // Unique identifier for each appointment.

    private String patientName;
    // The name of the patient who booked the appointment.

    private String doctorName;
    // The name of the doctor assigned to the appointment.

    private LocalDateTime dateTime;
    // The date and time when the appointment is scheduled.

    // Constructor to initialize all fields when creating a new Appointment object.
    public Appointment(int appointmentId, String patientName, String doctorName, LocalDateTime dateTime) {
        this.appointmentId = appointmentId; // Assigns the given appointment ID to this object's appointmentId.
        this.patientName = patientName;     // Assigns the given patient name to this object's patientName.
        this.doctorName = doctorName;       // Assigns the given doctor name to this object's doctorName.
        this.dateTime = dateTime;           // Assigns the given date/time to this object's dateTime.
    }

    // Getter method to retrieve the appointment ID.
    public int getAppointmentId() {
        return appointmentId;
    }

    // Getter method to retrieve the patient's name.
    public String getPatientName() {
        return patientName;
    }

    // Getter method to retrieve the doctor's name.
    public String getDoctorName() {
        return doctorName;
    }

    // Getter method to retrieve the scheduled date and time of the appointment.
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    // Overridden toString() method to provide a readable string representation of the appointment details.
    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId +       // Displays the appointment ID.
                "\nPatient: " + patientName +              // Displays the patient's name.
                "\nDoctor: " + doctorName +                // Displays the doctor's name.
                "\nDate/Time: " + dateTime;                // Displays the date and time of the appointment.
    }
}
