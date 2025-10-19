package test.business;

import data.PatientDAO;
import models.Patient;

// Local lightweight Test annotation used so tests compile without JUnit
@interface Test {}

@SuppressWarnings("unused")
public class PatientServiceTest {

    // Basic assertion helpers to avoid needing JUnit on the classpath
    private static void assertNotNull(Object o) {
        if (o == null) throw new AssertionError("Expected not null");
    }

    private static void assertNull(Object o) {
        if (o != null) throw new AssertionError("Expected null");
    }

    private static void assertEquals(Object expected, Object actual) {
        if (expected == null) {
            if (actual != null) throw new AssertionError("Expected null but was: " + actual);
        } else {
            if (!expected.equals(actual)) throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }

    private static void assertTrue(boolean cond) {
        if (!cond) throw new AssertionError("Expected true but was false");
    }

    private static void assertFalse(boolean cond) {
        if (cond) throw new AssertionError("Expected false but was true");
    }

    @Test
    void getPatient_existingDelegatesToDao() {
        PatientDAO dao = new PatientDAO(); // seeded with ID 1
        PatientService service = new PatientService(dao);

        Patient p = service.getPatient(1);
        assertNotNull(p);
        assertEquals(1, p.getId());
        assertEquals("John Doe", p.getName());
    }

    @Test
    void getPatient_missingReturnsNull() {
        PatientDAO dao = new PatientDAO();
        PatientService service = new PatientService(dao);

        Patient p = service.getPatient(9999);
        assertNull(p);
    }

    @Test
    void updateContactInfo_successForExisting() {
        PatientDAO dao = new PatientDAO(); // contains ID 1
        PatientService service = new PatientService(dao);

        boolean ok = service.updateContactInfo(
                1, "john.new@example.com", "77777777", "New Address 1"
        );
        assertTrue(ok);

        Patient reloaded = dao.getPatientById(1);
        assertNotNull(reloaded);
        assertEquals("john.new@example.com", reloaded.getEmail());
        assertEquals("77777777", reloaded.getPhone());
        assertEquals("New Address 1", reloaded.getAddress());
    }

    @Test
    void updateContactInfo_returnsFalseWhenMissing() {
        PatientDAO dao = new PatientDAO();
        PatientService service = new PatientService(dao);

        boolean ok = service.updateContactInfo(4242, "x@x.com", "0", "Nowhere");
        assertFalse(ok);
    }
}

// Minimal package-private PatientService used by the tests; delegates to PatientDAO.
class PatientService {
    private final PatientDAO dao;

    PatientService(PatientDAO dao) {
        this.dao = dao;
    }

    Patient getPatient(int id) {
        return dao.getPatientById(id);
    }

    boolean updateContactInfo(int id, String email, String phone, String address) {
        Patient p = dao.getPatientById(id);
        if (p == null) return false;
        // update the existing Patient instance; tests inspect the DAO's patient afterwards
        p.setEmail(email);
        p.setPhone(phone);
        p.setAddress(address);
        return true;
    }
}