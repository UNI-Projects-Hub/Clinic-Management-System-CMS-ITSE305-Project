package domain;

import java.util.Objects;

/** Entity representing a patient. */
public class Patient {
    private final int id;
    private final String fullName;

    public Patient(int id, String fullName) {
        this.id = id;
        this.fullName = Objects.requireNonNull(fullName, "Full name cannot be null or empty");
        if (fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("Full name cannot be empty");
        }
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }

    @Override
    public String toString() {
        return "Patient{id=" + id + ", fullName='" + fullName + "'}";
    }
}
