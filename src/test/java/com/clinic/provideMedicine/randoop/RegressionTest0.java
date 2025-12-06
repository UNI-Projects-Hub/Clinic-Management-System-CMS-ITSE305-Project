package com.clinic.provideMedicine.randoop;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords((int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass3 = medicalRecord2.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords((int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass3 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) (byte) 100);
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = patient4.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.lang.Class<?> wildcardClass10 = medicalRecordList9.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass5 = medicalRecord4.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecord6.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) ' ', "hi!");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.lang.Class<?> wildcardClass1 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 0);
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 100);
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass3 = medicalRecordList2.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) ' ');
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords(0);
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 0);
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass7 = medicalRecord6.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) -1);
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) 10, "");
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
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient2 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) ' ');
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient7 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 0);
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) ' ', "hi!");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) -1);
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 0);
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass7 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList3 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) -1);
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 10);
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = medicalRecord12.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = medicalRecordList4.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (byte) 0, "hi!");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 0);
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(0, "");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 100, "");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient7 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 10);
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 0);
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass3 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass8 = medicalRecordList7.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass8 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
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
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordList8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) '4', "");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) 'a');
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient(0);
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (byte) -1);
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((-1), "hi!");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) (byte) 10);
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
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordList8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) '#');
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) -1);
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (short) 10);
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
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 100);
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) ' ');
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = patient8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) 100);
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) ' ');
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(10, "");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 100);
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient15 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass16 = patient15.getClass();
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecord10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass14 = medicalRecord13.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords(10);
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((-1));
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.lang.Class<?> wildcardClass10 = medicalRecordList9.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(10, "");
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 97");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass5 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (byte) 0);
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 0);
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((-1));
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (byte) 10);
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) 10);
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 52");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord16 = medicalRecordService0.getRecord((int) (short) 10);
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
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (short) 0);
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(10);
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 100, "");
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient9 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 0);
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) -1, "");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) 'a', "hi!");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord9 = medicalRecordService0.getRecord((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (byte) 0);
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) (byte) -1);
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) -1);
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) '4');
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
            java.util.List<domain.MedicalRecord> medicalRecordList18 = medicalRecordService0.searchRecords((int) (short) -1, "");
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
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass13 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (byte) 0);
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecord11);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
            domain.MedicalRecord medicalRecord17 = medicalRecordService0.getRecord((int) (short) -1);
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.lang.Class<?> wildcardClass12 = medicalRecordList11.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = patient6.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 10);
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(0, "hi!");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass16 = medicalRecordService0.getClass();
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecordList5.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient((int) (short) 10);
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
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.Patient patient10 = medicalRecordService0.requirePatient(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = medicalRecord7.getClass();
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient(0);
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient(100);
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient11 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord7 = medicalRecordService0.getRecord((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.searchRecords((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
        org.junit.Assert.assertNotNull(medicalRecord7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        org.junit.Assert.assertNotNull(patient13);
        org.junit.Assert.assertNotNull(medicalRecord15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 35");
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((-1));
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) 1);
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.Patient patient13 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord15 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) -1);
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
        org.junit.Assert.assertNotNull(medicalRecordList15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.Patient patient8 = medicalRecordService0.requirePatient(1);
        java.lang.Class<?> wildcardClass9 = patient8.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords((int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass9 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
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
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) -1);
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList5 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient7 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList10 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(medicalRecord12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        org.junit.Assert.assertNotNull(medicalRecord14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        org.junit.Assert.assertNotNull(medicalRecordList13);
        org.junit.Assert.assertNotNull(patient15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient8 = medicalRecordService0.requirePatient(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = medicalRecord4.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) -1);
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecordList4);
        org.junit.Assert.assertNotNull(patient6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient15 = medicalRecordService0.requirePatient(0);
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
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
        org.junit.Assert.assertNotNull(patient11);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordList6.getClass();
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = patient10.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(patient10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) ' ');
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (byte) -1);
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords(1, "hi!");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 0);
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList16 = medicalRecordService0.listRecords((int) (short) 10);
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
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) ' ');
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
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
            domain.Patient patient17 = medicalRecordService0.requirePatient((int) (short) -1);
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient16 = medicalRecordService0.requirePatient((int) ' ');
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.listRecords((int) (byte) 0);
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
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = medicalRecordList6.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord8 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecord8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.searchRecords((int) (byte) 100, "");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
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
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecord10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 10");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 35");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        domain.Patient patient9 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient11 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords(1, "");
        java.lang.Class<?> wildcardClass15 = medicalRecordList14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
        org.junit.Assert.assertNotNull(patient9);
        org.junit.Assert.assertNotNull(patient11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient6 = medicalRecordService0.requirePatient(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList7 = medicalRecordService0.searchRecords(1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.listRecords((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecordList7);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord14 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass15 = medicalRecordService0.getClass();
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
            java.util.List<domain.MedicalRecord> medicalRecordList17 = medicalRecordService0.listRecords((int) (short) 0);
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(0);
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
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
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (short) 1);
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
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass11 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecord10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
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
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 100");
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
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.lang.Class<?> wildcardClass10 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(0);
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
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.listRecords((int) (short) 0);
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
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords(1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((int) (short) -1, "");
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient10 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord12 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient14 = medicalRecordService0.requirePatient((int) 'a');
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
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient12 = medicalRecordService0.requirePatient((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 32");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
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
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 10, "");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient13 = medicalRecordService0.requirePatient((int) '#');
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(patient4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecord11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.Patient patient2 = medicalRecordService0.requirePatient((int) (byte) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            domain.MedicalRecord medicalRecord11 = medicalRecordService0.getRecord(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Record not found: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(patient2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecordList6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList13 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.MedicalRecord medicalRecord6 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords(1);
        java.lang.Class<?> wildcardClass12 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(medicalRecord6);
        org.junit.Assert.assertNotNull(medicalRecordList9);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        java.util.List<domain.MedicalRecord> medicalRecordList2 = medicalRecordService0.listRecords((int) (short) 1);
        domain.Patient patient4 = medicalRecordService0.requirePatient((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList6 = medicalRecordService0.listRecords((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(medicalRecordList2);
        org.junit.Assert.assertNotNull(patient4);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        // The following exception was thrown during execution in test generation
        try {
            domain.Patient patient2 = medicalRecordService0.requirePatient((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Patient ID not found: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList4 = medicalRecordService0.listRecords((int) (byte) 1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList9 = medicalRecordService0.searchRecords((int) (byte) 1, "hi!");
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.listRecords((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(medicalRecordList11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        domain.MedicalRecord medicalRecord10 = medicalRecordService0.getRecord(1);
        java.util.List<domain.MedicalRecord> medicalRecordList12 = medicalRecordService0.listRecords((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<domain.MedicalRecord> medicalRecordList15 = medicalRecordService0.searchRecords((-1), "hi!");
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
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (short) 1);
        domain.Patient patient8 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords(1, "");
        java.util.List<domain.MedicalRecord> medicalRecordList14 = medicalRecordService0.searchRecords((int) (byte) 1, "");
        java.lang.Class<?> wildcardClass15 = medicalRecordList14.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(patient8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecordList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        business.MedicalRecordService medicalRecordService0 = new business.MedicalRecordService();
        domain.MedicalRecord medicalRecord2 = medicalRecordService0.getRecord((int) (short) 1);
        domain.MedicalRecord medicalRecord4 = medicalRecordService0.getRecord(1);
        domain.Patient patient6 = medicalRecordService0.requirePatient((int) (byte) 1);
        java.util.List<domain.MedicalRecord> medicalRecordList8 = medicalRecordService0.listRecords(1);
        java.util.List<domain.MedicalRecord> medicalRecordList11 = medicalRecordService0.searchRecords((int) (short) 1, "hi!");
        domain.MedicalRecord medicalRecord13 = medicalRecordService0.getRecord(1);
        java.lang.Class<?> wildcardClass14 = medicalRecordService0.getClass();
        org.junit.Assert.assertNotNull(medicalRecord2);
        org.junit.Assert.assertNotNull(medicalRecord4);
        org.junit.Assert.assertNotNull(patient6);
        org.junit.Assert.assertNotNull(medicalRecordList8);
        org.junit.Assert.assertNotNull(medicalRecordList11);
        org.junit.Assert.assertNotNull(medicalRecord13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

