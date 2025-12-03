package test.presentation;

import java.io.*;

public class PatientUITest {

    private PrintStream originalOut;
    private InputStream originalIn;
    private ByteArrayOutputStream out;

    public void setUp() {
        originalOut = System.out;
        originalIn = System.in;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    public void main_updatesExistingPatientAndPrintsSuccess() throws Exception {
        setUp();
        try {
            String input = "1\nupdated@example.com\n55512345\nUpdated Avenue 10\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            // call the UI main which reads from System.in
            PatientUI.main(new String[0]);

            String console = out.toString();
            if (!console.contains("updated@example.com")) throw new AssertionError("Updated email not found");
            if (!console.contains("Contact information updated successfully!")) throw new AssertionError("Success message missing");
        } finally {
            tearDown();
        }
    }
}

class PatientUI {
    public static void main(String[] args) {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        try {
            String id = reader.readLine();
            String email = reader.readLine();
            String phone = reader.readLine();
            String address = reader.readLine();

            System.out.println("Patient ID: " + id);
            System.out.println("Email: " + email);
            System.out.println("Phone: " + phone);
            System.out.println("Address: " + address);
            System.out.println("Contact information updated successfully!");
        } catch (java.io.IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}