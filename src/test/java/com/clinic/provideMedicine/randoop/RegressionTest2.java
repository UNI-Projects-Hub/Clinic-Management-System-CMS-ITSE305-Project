package com.clinic.provideMedicine.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) -1);
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
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(0, "hi!");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 0);
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 0);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords(10);
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
        org.junit.Assert.assertNotNull(medicalRecord14);
        org.junit.Assert.assertNotNull(patient16);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
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
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) '#', "");
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
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(0);
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(0);
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 100);
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
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
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 100);
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
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) -1, "");
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
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
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
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass18 = medicalRecordService0.getClass();
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 100);
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(patient17);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) -1);
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
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
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 100, "");
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecord13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 0);
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = patient12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 10);
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 0);
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
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
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordList13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass8 = patient7.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) '#');
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
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
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
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = patient16.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(patient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(100, "hi!");
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(10);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 0, "");
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) -1);
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
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((-1));
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords(10, "");
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient2 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 0);
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
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
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 0, "hi!");
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
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) -1, "");
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
            domain.Patient patient19 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(0, "hi!");
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
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient(10);
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) (short) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass17 = medicalRecordList16.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) -1, "");
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecordList5.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = patient12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.listRecords((int) (short) 0);
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
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.listRecords((int) (short) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
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
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordList8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (byte) -1);
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = patient13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
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
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
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
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.searchRecords(100, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass16 = medicalRecordList15.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) '#');
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
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(10, "");
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.listRecords((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(100);
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass20 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
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
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
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
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.listRecords((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(patient17);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 10);
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
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass9 = medicalRecord8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(0);
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
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass12 = medicalRecord11.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 10, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
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
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecord13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = patient15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass19 = medicalRecordList18.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
            java.util.List<domain.MedicalRecord> medicalRecordList22 = medicalRecordService0.searchRecords((int) (byte) -1, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord20 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
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
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
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
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 100);
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = patient11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 10);
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 0);
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass10 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient(100);
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
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecord17);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass11 = medicalRecordList10.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(patient16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) (short) 10);
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
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) -1);
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
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient(0);
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
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
        org.junit.Assert.assertNotNull(medicalRecord17);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass18 = medicalRecord17.getClass();
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
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass14 = medicalRecordList13.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass19 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass15 = patient14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord(0);
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
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) 'a', "");
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
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass19 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) -1);
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
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords(0);
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
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecordList15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
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
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 100);
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
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = patient10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = patient9.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
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
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList19);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
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
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) 'a');
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
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
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) '#', "");
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
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords(100);
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
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 10);
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
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient14 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords((int) (byte) 10, "");
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
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient(0);
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((-1));
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
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient17 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord(10);
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
        org.junit.Assert.assertNotNull(patient17);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = patient11.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (short) 0);
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
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(10);
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
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
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
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = medicalRecordList4.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient2 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((-1));
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecord9);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient22 = medicalRecordService0.requirePatient(100);
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
        org.junit.Assert.assertNotNull(medicalRecordList17);
        org.junit.Assert.assertNotNull(medicalRecordList20);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
            java.util.List<domain.MedicalRecord> medicalRecordList21 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
            domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
            domain.Patient patient20 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient19 = medicalRecordService0.requirePatient((int) (short) -1);
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
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 0, "");
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
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord22 = medicalRecordService0.getRecord((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList17);
        org.junit.Assert.assertNotNull(medicalRecordList20);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "");
        java.lang.Class<?> wildcardClass8 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.listRecords((int) (short) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecordList16);
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 100);
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
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) '#', "hi!");
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient7 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (byte) 100);
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
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords((int) (byte) 100, "");
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
        org.junit.Assert.assertNotNull(patient15);
        org.junit.Assert.assertNotNull(medicalRecordList17);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 10);
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
        org.junit.Assert.assertNotNull(medicalRecord9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 100);
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecord15.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((int) (short) 1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.Patient patient12 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords(1);
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(patient12);
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        java.lang.Class<?> wildcardClass21 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
        org.junit.Assert.assertNotNull(medicalRecordList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 0);
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient17 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.listRecords((int) 'a');
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
        org.junit.Assert.assertNotNull(medicalRecord15);
        org.junit.Assert.assertNotNull(patient17);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
            domain.Patient patient18 = medicalRecordService0.requirePatient((int) (byte) 0);
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords(1, "");
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecordList18);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords((int) ' ', "");
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = medicalRecordService0.getClass();
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
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) 'a');
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
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.Patient patient14 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(patient14);
        org.junit.Assert.assertNotNull(medicalRecordList16);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "");
        java.lang.Class<?> wildcardClass15 = medicalRecordList14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) (short) 0);
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
        org.junit.Assert.assertNotNull(medicalRecordList14);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
            java.util.List<domain.MedicalRecord> medicalRecordList19 = medicalRecordService0.searchRecords((int) (byte) 100, "");
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(0, "");
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 10);
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
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords(1, "");
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.searchRecords(1, "hi!");
        domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord21 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords(1, "");
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord19 = medicalRecordService0.getRecord(1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(medicalRecordList15);
        org.junit.Assert.assertNotNull(medicalRecordList17);
        org.junit.Assert.assertNotNull(medicalRecord19);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 1);
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient7 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(patient7);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.searchRecords((int) (short) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord18 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) -1);
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
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
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecordList10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
            java.util.List<domain.MedicalRecord> medicalRecordList20 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) '4', "hi!");
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
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) ' ');
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
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
}

