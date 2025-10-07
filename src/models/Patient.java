package models;

// Patient class represents a patient entity with basic contact information
public class Patient {
    private int id;          // Unique ID for each patient
    private String name;     // Patient's full name
    private String email;    // Patient's email address
    private String phone;    // Patient's phone number
    private String address;  // Patient's residential address

    // Constructor to initialize a patient object
    public Patient(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters and Setters to access and modify patient details
    public int getId() { return id; }
    public String getName() { return name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    // Convert patient details into a readable string format
    @Override
    public String toString() {
        return "Patient ID: " + id + "\nName: " + name + "\nEmail: " + email +
                "\nPhone: " + phone + "\nAddress: " + address;
    }
}
