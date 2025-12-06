// ui/Main.java
// This file defines the AppointmentUI class, which provides a simple console-based
// user interface for adding and viewing appointments. It interacts with the
// AppointmentService and AppointmentDAO layers to create new appointments.

import java.time.LocalDateTime;
// Importing LocalDateTime to handle date and time input for appointments.

import java.util.Scanner;
// Importing Scanner for reading user input from the console.

public class Main {
    // The main user interface class that handles input/output operations for appointments.

    public static void main(String[] args) {
        // The main method — the entry point of the program.

        Scanner scanner = new Scanner(System.in);
        // Creates a Scanner object to read input from the user through the console.

        AppointmentDAO dao = new AppointmentDAO();
        // Creates an instance of AppointmentDAO (Data Access Object) to manage stored appointments.

        AppointmentService service = new AppointmentService(dao);
        // Creates an instance of AppointmentService, passing the DAO to handle business logic.

        System.out.println("=== Add New Appointment ===");
        // Displays a title message for the user interface.

        System.out.print("Enter patient name: ");
        // Prompts the user to input the patient's name.

        String patientName = scanner.nextLine();
        // Reads the entered patient name from the console.

        System.out.print("Enter doctor name: ");
        // Prompts the user to input the doctor's name.

        String doctorName = scanner.nextLine();
        // Reads the entered doctor name from the console.

        System.out.print("Enter appointment date/time (yyyy-MM-ddTHH:mm): ");
        // Prompts the user to input the appointment date and time in a specific format.

        String dateTimeInput = scanner.nextLine();
        // Reads the date/time input as a string.

        try {
            // Attempt to parse the date/time string into a LocalDateTime object.
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeInput);

            // Calls the service layer to add the new appointment with the provided details.
            Appointment appointment = service.addAppointment(patientName, doctorName, dateTime);

            // If successful, display confirmation and appointment details.
            System.out.println("\nAppointment added successfully:");
            System.out.println(appointment);
        } catch (Exception e) {
            // Handles invalid date format input or parsing errors.
            System.out.println("Invalid date format. Please use yyyy-MM-ddTHH:mm (e.g., 2025-10-10T14:00)");
        }

        scanner.close();
        // Closes the Scanner to prevent resource leaks.
    }
}
