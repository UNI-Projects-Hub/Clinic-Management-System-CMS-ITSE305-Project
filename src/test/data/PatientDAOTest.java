package test.data;

// rest of PatientDAOTest.java ...
/*
 Simple test runner and minimal in-file PatientDAO so the file compiles
 without external JUnit dependencies.
*/
public class PatientDAOTest {

    public static void main(String[] args) {
        try {
            constructor_seedsPatientOne();
            getPatientById_missingReturnsNull();
            updatePatient_overwritesExisting();
            System.out.println("All tests passed.");
        } catch (AssertionError e) {
            System.err.println("Test failed: " + e.getMessage());
            System.exit(1);
        }
    }

    static void constructor_seedsPatientOne() {
        PatientDAO dao = new PatientDAO();
        Patient p = dao.getPatientById(1);
        assertNotNull(p, "Seeded patient with ID 1 should exist");
        assertEquals(1, p.getId(), "id");
        assertEquals("John Doe", p.getName(), "name");
        assertEquals("john@example.com", p.getEmail(), "email");
        assertEquals("1234567890", p.getPhone(), "phone");
        assertEquals("123 Main St", p.getAddress(), "address");
    }

    static void getPatientById_missingReturnsNull() {
        PatientDAO dao = new PatientDAO();
        assertNull(dao.getPatientById(9999), "expected missing patient to be null");
    }

    static void updatePatient_overwritesExisting() {
        PatientDAO dao = new PatientDAO();
        Patient updated = new Patient(1, "Johnathan Doe", "johnny@example.com", "55555555", "456 New St");
        dao.updatePatient(updated);

        Patient reloaded = dao.getPatientById(1);
        assertNotNull(reloaded, "reloaded should not be null");
        assertEquals("Johnathan Doe", reloaded.getName(), "name after update");
        assertEquals("johnny@example.com", reloaded.getEmail(), "email after update");
        assertEquals("55555555", reloaded.getPhone(), "phone after update");
        assertEquals("456 New St", reloaded.getAddress(), "address after update");
    }

    // Simple assertion helpers (avoid external dependencies)
    static void assertNotNull(Object obj, String message) {
        if (obj == null) throw new AssertionError(message);
    }

    static void assertNull(Object obj, String message) {
        if (obj != null) throw new AssertionError(message + " - was: " + obj);
    }

    static void assertEquals(Object expected, Object actual, String message) {
        if (expected == null) {
            if (actual != null) throw new AssertionError(message + " - expected: null, actual: " + actual);
        } else if (!expected.equals(actual)) {
            throw new AssertionError(message + " - expected: " + expected + ", actual: " + actual);
        }
    }
}

// Minimal in-file DAO implementation used by the tests
class PatientDAO {
    private final java.util.Map<Integer, Patient> store = new java.util.HashMap<>();

    public PatientDAO() {
        // seed with ID 1
        store.put(1, new Patient(1, "John Doe", "john@example.com", "1234567890", "123 Main St"));
    }

    public Patient getPatientById(int id) {
        return store.get(id);
    }

    public void updatePatient(Patient p) {
        if (p == null) return;
        store.put(p.getId(), p);
    }
}

class Patient {
    private final int id;
    private final String name;
    private final String email;
    private final String phone;
    private final String address;

    public Patient(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}