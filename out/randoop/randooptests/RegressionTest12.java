package randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList25 = medicalRecordService0.searchRecords(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList26 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(medicalRecord24);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass19 = medicalRecord18.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass15 = medicalRecord14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient24 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList24 = medicalRecordService0.listRecords(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord26 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord28 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord30 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(medicalRecord24);
        org.junit.Assert.assertNotNull(medicalRecord26);
        org.junit.Assert.assertNotNull(medicalRecord28);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord26 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList29 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(medicalRecord24);
        org.junit.Assert.assertNotNull(medicalRecord26);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass7 = medicalRecord6.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList27 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(medicalRecord24);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList24 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass17 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = medicalRecord14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass17 = medicalRecord16.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass17 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient22 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient22 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList27 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(medicalRecord24);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList24 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord26 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord28 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(medicalRecord24);
        org.junit.Assert.assertNotNull(medicalRecord26);
        org.junit.Assert.assertNotNull(medicalRecord28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass15 = medicalRecord14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = medicalRecord14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = medicalRecord16.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord26 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord28 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = medicalRecord28.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
        org.junit.Assert.assertNotNull(medicalRecord24);
        org.junit.Assert.assertNotNull(medicalRecord26);
        org.junit.Assert.assertNotNull(medicalRecord28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = medicalRecord14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient22 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient24 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = medicalRecord16.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList24 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList25 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = medicalRecord14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecord12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecord12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList25 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient22 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList25 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList23 = medicalRecordService0.searchRecords((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord24 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(medicalRecord20);
        org.junit.Assert.assertNotNull(medicalRecord22);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }
}

