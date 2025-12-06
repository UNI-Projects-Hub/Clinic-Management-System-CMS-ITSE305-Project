package com.clinic.provideMedicine.randoop;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = patient4.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass9 = medicalRecord8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordList6.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordList13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecordList15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = patient6.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass16 = medicalRecordList15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass15 = medicalRecord14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass13 = medicalRecord12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = medicalRecordList9.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass9 = medicalRecordList8.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass16 = medicalRecordList15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(patient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass14 = medicalRecordList13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass11 = medicalRecordList10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = patient7.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(patient16);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = medicalRecordList9.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(patient16);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = medicalRecordList9.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = patient11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = patient10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecordList5.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(patient16);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = patient12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass10 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.lang.Class<?> wildcardClass8 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordList8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass13 = medicalRecordList12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass16 = medicalRecordList15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = patient10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = patient14.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass14 = medicalRecord13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecord11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(patient17);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass16 = medicalRecordList15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.lang.Class<?> wildcardClass14 = medicalRecordList13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(patient17);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass15 = medicalRecordList14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass14 = medicalRecordList13.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecord15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass9 = medicalRecordList8.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass14 = medicalRecordList13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = patient12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass19 = medicalRecordList18.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

