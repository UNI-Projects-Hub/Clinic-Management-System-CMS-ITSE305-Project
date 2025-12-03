package test.models;

// Simple, self-contained tests that don't require JUnit on the classpath.
class PatientTest {

    public static void main(String[] args) {
        PatientTest t = new PatientTest();
        t.constructorAndGetters_work();
        t.setters_updateFields();
        t.toString_containsAllFields();
        System.out.println("All tests passed");
    }

    void constructorAndGetters_work() {
        Patient p = new Patient(7, "Alice Smith", "alice@ex.com", "77777777", "Road 7");
        assertEquals(7, p.getId());
        assertEquals("Alice Smith", p.getName());
        assertEquals("alice@ex.com", p.getEmail());
        assertEquals("77777777", p.getPhone());
        assertEquals("Road 7", p.getAddress());
    }

    void setters_updateFields() {
        Patient p = new Patient(1, "N", "e@x", "0", "A");
        p.setName("Bob Builder");
        p.setEmail("bob@ex.com");
        p.setPhone("123456");
        p.setAddress("Block B");
        assertEquals("Bob Builder", p.getName());
        assertEquals("bob@ex.com", p.getEmail());
        assertEquals("123456", p.getPhone());
        assertEquals("Block B", p.getAddress());
    }

    void toString_containsAllFields() {
        Patient p = new Patient(9, "Carol", "carol@ex.com", "999", "Way 9");
        String s = p.toString();
        assertTrue(s.contains("Patient ID: 9"));
        assertTrue(s.contains("Name: Carol"));
        assertTrue(s.contains("Email: carol@ex.com"));
        assertTrue(s.contains("Phone: 999"));
        assertTrue(s.contains("Address: Way 9"));
    }

    // simple assertion helpers to avoid JUnit dependency
    void assertEquals(Object expected, Object actual) {
        if (expected == null ? actual != null : !expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }

    void assertEquals(long expected, long actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + " but was: " + actual);
        }
    }

    void assertTrue(boolean condition) {
        if (!condition) throw new AssertionError("Expected condition to be true");
    }

    static class Patient {
        private final long id;
        private String name;
        private String email;
        private String phone;
        private String address;

        Patient(long id, String name, String email, String phone, String address) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.address = address;
        }

        long getId() { return id; }
        String getName() { return name; }
        String getEmail() { return email; }
        String getPhone() { return phone; }
        String getAddress() { return address; }

        void setName(String name) { this.name = name; }
        void setEmail(String email) { this.email = email; }
        void setPhone(String phone) { this.phone = phone; }
        void setAddress(String address) { this.address = address; }

        @Override
        public String toString() {
            return "Patient ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Email: " + email + "\n"
                + "Phone: " + phone + "\n"
                + "Address: " + address;
        }
    }
}