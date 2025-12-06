// data/AppointmentDAO.java
// This file defines the AppointmentDAO class, which acts as a Data Access Object (DAO)
// to manage appointment records in memory (storing, retrieving, and assigning IDs).

import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {

    private List<Appointment> appointments = new ArrayList<>();
    // A list that holds all Appointment objects currently stored in memory

    private int idCounter = 1;
    // A counter used to assign unique, incremental IDs to each new appointment.

    // Method to save a new appointment into the list.
    // It automatically assigns a unique ID and returns the saved appointment object.
    public Appointment save(Appointment appointment) {

        // Basic validation to ensure a valid Appointment object is passed.
        if (appointment == null) {
            throw new IllegalArgumentException("Cannot save a null appointment.");
        }

        // Create a new Appointment instance with a unique ID and data copied from the given appointment.
        Appointment newAppointment = new Appointment(
                idCounter++,                       // Assign and increment the ID counter.
                appointment.getPatientName(),      // Copies the patient's name.
                appointment.getDoctorName(),       // Copies the doctor's name.
                appointment.getDateTime()          // Copies the appointment's date and time.
        );

        appointments.add(newAppointment);          // Adds the new appointment to the list.
        return newAppointment;                     // Returns the saved appointment.
    }

    // Method to retrieve all stored appointments.
    // Returns a list containing all Appointment objects.
    public List<Appointment> getAllAppointments() {
        return appointments;                        // Returns the current list of appointments.
    }
}
