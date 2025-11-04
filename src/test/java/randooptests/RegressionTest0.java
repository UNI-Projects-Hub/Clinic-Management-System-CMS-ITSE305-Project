package randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        java.lang.Class<?> wildcardClass2 = patientService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            models.Patient patient3 = patientService1.getPatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 100, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) 'a', "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 1, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 10, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '#', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) '4', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 100, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(0, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((-1), "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) -1, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 1, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(1, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) -1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 10, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(10, "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (short) 0, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) (byte) 0, "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo((int) ' ', "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        data.PatientDAO patientDAO0 = null;
        business.PatientService patientService1 = new business.PatientService(patientDAO0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = patientService1.updateContactInfo(100, "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.PatientDAO.getPatientById(int)\" because \"this.patientDAO\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

