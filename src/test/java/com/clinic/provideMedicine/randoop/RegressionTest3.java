package com.clinic.provideMedicine.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.listRecords((int) '4');
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass16 = medicalRecord15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords(0, "");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.MedicalRecord medicalRecord21 = medicalRecordService0.getRecord((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
        org.junit.Assert.assertNotNull(medicalRecord21);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass13 = medicalRecord12.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) -1);
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 10, "");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(0);
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient20 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient22 = medicalRecordService0.requirePatient((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(patient20);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 100);
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((-1));
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
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass17 = medicalRecordList16.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordList8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((-1));
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
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((-1));
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
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass18 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecord17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient17 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = patient17.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(patient17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) -1);
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
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "hi!");
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass18 = medicalRecordList17.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecordList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient(1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecord16);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
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
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
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
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (short) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecord17);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
            domain.Patient patient19 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
            domain.Patient patient19 = medicalRecordService0.requirePatient((int) (short) 100);
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord21 = medicalRecordService0.getRecord((int) ' ');
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "hi!");
        domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
        org.junit.Assert.assertNotNull(medicalRecord19);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
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
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
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
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord21 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecord16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
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
        org.junit.Assert.assertNotNull(medicalRecordList18);
        org.junit.Assert.assertNotNull(medicalRecordList20);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass18 = medicalRecord17.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(medicalRecord17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
        org.junit.Assert.assertNotNull(medicalRecord20);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = medicalRecordList16.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient19 = medicalRecordService0.requirePatient((int) ' ');
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
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient20 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecord18);
        org.junit.Assert.assertNotNull(patient20);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }
}

