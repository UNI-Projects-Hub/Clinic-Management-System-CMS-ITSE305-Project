// data/AppointmentDAO.java
// This file defines the AppointmentDAO class, which acts as a Data Access Object (DAO)
// to manage appointment records in memory (storing, retrieving, and assigning IDs).

import java.util.ArrayList;
// Importing the ArrayList class to store multiple Appointment objects dynamically.
import java.util.List;
// Importing the List interface to define a general type for appointment storage.

public class AppointmentDAO {
    // Class definition for AppointmentDAO — responsible for handling appointment data operations.


    private List<Appointment> appointments = new ArrayList<>();
    // A list that holds all Appointment objects currently stored in memory

    private int idCounter = 1;
    // A counter used to assign unique, incremental IDs to each new appointment.

    // Method to save a new appointment into the list.
    // It automatically assigns a unique ID and returns the saved appointment object.
    public Appointment save(Appointment appointment) {
        // Create a new Appointment instance with a unique ID and data copied from the given appointment.
        Appointment newAppointment = new Appointment(
                idCounter++,                       // Assigns and increments the ID counter.
                appointment.getPatientName(),       // Copies the patient's name.
                appointment.getDoctorName(),        // Copies the doctor's name.
                appointment.getDateTime()           // Copies the appointment's date and time.
        );

        appointments.add(newAppointment);           // Adds the new appointment to the list.
        return newAppointment;                      // Returns the saved appointment.
    }

    // Method to retrieve all stored appointments.
    // Returns a list containing all Appointment objects.
    public List<Appointment> getAllAppointments() {
        return appointments;                        // Returns the current list of appointments.
    }
}
