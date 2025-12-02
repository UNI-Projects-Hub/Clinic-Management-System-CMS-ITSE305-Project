package randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) 'a', localDate2, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #97 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) 10, localDate2, "Record #32 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass17 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 52, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 35, localDate2, "Record #1 | Patient #97 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) -1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (byte) 10, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 10, localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 32, localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 100, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (-1), localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #52 | Patient #0 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary: Record #52 | Patient #0 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #0 | Date: null | Summary: Record #52 | Patient #0 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #1 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 0, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 100, localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) 'a', localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (short) 1, localDate2, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.getNotes();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getNotes();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (-1), localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 0, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '#', localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (-1), localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (-1), localDate2, "", "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 0, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 100, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 35, localDate2, "Record #97 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 97, localDate2, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.lang.String str17 = medicalRecord5.getSummary();
        java.time.LocalDate localDate18 = medicalRecord5.getDate();
        java.lang.String str19 = medicalRecord5.toString();
        java.time.LocalDate localDate20 = medicalRecord5.getDate();
        java.lang.String str21 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str19, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 10, localDate2, "Record #35 | Patient #100 | Date: null | Summary: hi! | Notes: Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getRecordId();
        int int17 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.lang.String str16 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.toString();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 10, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #10 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #10 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.lang.String str17 = medicalRecord5.toString();
        int int18 = medicalRecord5.getRecordId();
        int int19 = medicalRecord5.getRecordId();
        java.lang.String str20 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str20, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (byte) 0, localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 10, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #52 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 10, localDate2, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 10, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) 'a', localDate2, "", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        int int17 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass18 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass17 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 32, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 10, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 100, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.toString();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) 0, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.toString();
        int int15 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 10, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 97, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #1 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #1 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) 10, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.lang.String str16 = medicalRecord5.getNotes();
        int int17 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate18 = medicalRecord5.getDate();
        int int19 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '#', localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 52, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #100 | Patient #10 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #10 | Date: null | Summary: ");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 10, localDate2, "", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 10, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 32, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 35, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) '4', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 100, localDate2, "hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 1, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.toString();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        int int17 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (byte) 100, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 10, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.getSummary();
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.getSummary();
        java.lang.String str18 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str18, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 32, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.toString();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        java.lang.String str16 = medicalRecord5.getSummary();
        int int17 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) -1, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #52 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.lang.String str16 = medicalRecord5.getSummary();
        int int17 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str9, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 100, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) '4', localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #100 | Date: null | Summary:  | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!" + "'", str7, "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 100, localDate2, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 1, localDate2, "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #10 | Patient #97 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 100, localDate2, "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) -1, localDate2, "", "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.lang.String str17 = medicalRecord5.getNotes();
        java.lang.String str18 = medicalRecord5.getSummary();
        int int19 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 100, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #32 | Patient #35 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 97, localDate2, "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 1, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 97, localDate2, "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) '4', localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) 'a', localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.toString();
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 0, localDate2, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #0 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #-1 | Patient #0 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 10, localDate2, "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 100, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 10, localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.toString();
        int int17 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass18 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = localDate15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 10, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #97 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) -1, localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: ");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 100, localDate2, "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "", "");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) -1, localDate2, "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str14, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #-1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 1, localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 10, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 1, localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #1 | Patient #1 | Date: null | Summary: Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getRecordId();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.getNotes();
        int int17 = medicalRecord5.getPatientId();
        int int18 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #52 | Date: null | Summary: Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #1 | Patient #52 | Date: null | Summary: Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 100, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str10, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary: ", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) -1, localDate2, "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) '4', localDate2, "", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) '4', localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 97, localDate2, "Record #32 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 100, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) '#', localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #52 | Date: null | Summary: Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getPatientId();
        int int16 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.getSummary();
        java.lang.String str16 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) -1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #52 | Date: null | Summary: Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) ' ', localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 10, localDate2, "hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 0, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #97 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) '4', localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getPatientId();
        java.lang.String str17 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 32, localDate2, "Record #35 | Patient #52 | Date: null | Summary: Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #100 | Date: null | Summary:  | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 52, localDate2, "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '4', localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (short) 10, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 10, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 1, localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #1 | Date: null | Summary: Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #1 | Date: null | Summary: Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getPatientId();
        int int16 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 100, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #97 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '#', localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        java.lang.String str16 = medicalRecord5.getNotes();
        java.lang.String str17 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #10 | Date: null | Summary: Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 97, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 35, localDate2, "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass17 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 52, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.getSummary();
        java.lang.String str17 = medicalRecord5.getSummary();
        java.lang.String str18 = medicalRecord5.getNotes();
        int int19 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass20 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 10, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #52 | Patient #0 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (byte) 0, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #97 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 10, localDate2, "", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 52, localDate2, "hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) -1, localDate2, "", "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 10, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #32 | Patient #10 | Date: null | Summary: Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.toString();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) '4', localDate2, "", "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 1, localDate2, "", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 100, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) -1, localDate2, "Record #35 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 100, localDate2, "Record #-1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (-1), localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (-1), localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 100, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 97, localDate2, "Record #97 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (byte) 0, localDate2, "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) ' ', localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '#', localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) -1, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) '4', localDate2, "Record #35 | Patient #52 | Date: null | Summary: Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #10 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 10, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '#', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 100, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 97, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 100, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) '4', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.getNotes();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 0, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getPatientId();
        int int17 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 32, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary: Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 1, localDate2, "", "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) ' ', localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #-1 | Date: null | Summary: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 1, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '#', localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 1, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 0, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 35, localDate2, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 97, localDate2, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 32, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 100, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 1, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 35, localDate2, "Record #1 | Patient #1 | Date: null | Summary: Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }
}

