package domain;

/** Entity representing a patient. */
public class Patient {
    private final int id;
    private final String fullName;

    public Patient(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
    public int getId() { return id; }
    public String getFullName() { return fullName; }

    @Override public String toString() {
        return "Patient{id=" + id + ", fullName='" + fullName + "'}";
    }
}
