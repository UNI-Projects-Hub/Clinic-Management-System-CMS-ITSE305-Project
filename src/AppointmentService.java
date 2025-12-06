// service/AppointmentService.java
// This file defines the AppointmentService class, which acts as a service layer
// between the data access layer (AppointmentDAO) and the application logic.
// It handles business operations such as adding a new appointment.

import java.time.LocalDateTime;
// Importing LocalDateTime for handling appointment date and time values.

import org.junit.jupiter.api.AfterEach;
// Imported but not used in this class — likely a leftover import from testing.
// It can be safely removed if unused.

public class AppointmentService {
    // Class definition for AppointmentService — responsible for managing appointment operations.


    private AppointmentDAO appointmentDAO;
    // Reference to the AppointmentDAO object used to store and retrieve appointment data.

    // Constructor that initializes the AppointmentService with a given AppointmentDAO instance.
    public AppointmentService(AppointmentDAO appointmentDAO) {
        this.appointmentDAO = appointmentDAO; // Assigns the provided DAO to the local field.
    }

    // Method to add a new appointment to the system.
    // It accepts the patient name, doctor name, and date/time as parameters.
    // Returns the saved Appointment object after storing it via AppointmentDAO.
    public Appointment addAppointment(String patientName, String doctorName, LocalDateTime dateTime) {
        // Creates a temporary Appointment object with ID = 0 (since DAO will assign a real ID).
        Appointment appointment = new Appointment(0, patientName, doctorName, dateTime);

        // Saves the new appointment using the DAO and returns the saved instance.
        return appointmentDAO.save(appointment);
    }
}
