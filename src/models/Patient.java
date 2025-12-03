package models;

/**
 * Patient entity representing basic personal and contact information.
 * The patient name is intentionally immutable (final) because
 * name changes are not supported in the current system design.
 */
public class Patient {

    private final int id;      // Unique ID for each patient
    private final String name; // Patient's full name (immutable)

    private String email;      // Patient's email address
    private String phone;      // Patient's phone number
    private String address;    // Patient's residential address

    // Constructor to initialize patient data
    public Patient(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPhone(phone);
        setAddress(address);
    }

    // ----- Getters -----
    public int getId() { return id; }
    public String getName() { return name; }

    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    // ----- Setters with basic validation -----
    public void setEmail(String email) {
        if (email == null || !email.contains("@") || email.length() < 5) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\+?[0-9]{7,15}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address cannot be empty");
        }
        this.address = address;
    }

    // Convert patient details to readable format
    @Override
    public String toString() {
        return "Patient ID: " + id +
               "\nName: " + name +
               "\nEmail: " + email +
               "\nPhone: " + phone +
               "\nAddress: " + address;
    }
}
