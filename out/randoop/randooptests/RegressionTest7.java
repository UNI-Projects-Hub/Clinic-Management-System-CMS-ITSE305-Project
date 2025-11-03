package randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) -1, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #-1 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #-1 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 52, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str14, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 0, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        java.lang.String str19 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass20 = medicalRecord5.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 97, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 32, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getRecordId();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str13, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 0, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #0 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 0, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 0, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 52, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 0, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) 100, localDate2, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 97, localDate2, "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 97, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 100, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 1, localDate2, "", "Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 10, localDate2, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) 'a', localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str9, "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        java.lang.String str16 = medicalRecord5.getSummary();
        int int17 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 10, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        java.lang.String str15 = medicalRecord5.toString();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 10, localDate2, "", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.toString();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (byte) 10, localDate2, "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.getNotes();
        java.lang.String str17 = medicalRecord5.toString();
        int int18 = medicalRecord5.getPatientId();
        int int19 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '#', localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 32, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) '4', localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str13, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        java.lang.String str15 = medicalRecord5.getSummary();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.lang.String str17 = medicalRecord5.getSummary();
        java.lang.String str18 = medicalRecord5.getSummary();
        java.lang.String str19 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str19, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) -1, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 35, localDate2, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 10, localDate2, "Record #97 | Patient #100 | Date: null | Summary:  | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 10, localDate2, "Record #35 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) '4', localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 100, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (short) 1, localDate2, "Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 10, localDate2, "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str10, "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 100, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 10, localDate2, "", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) -1, localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 100, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 97, localDate2, "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 52, localDate2, "hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 32, localDate2, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) 'a', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (byte) 100, localDate2, "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #1 | Date: null | Summary: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 10, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 10, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.lang.String str16 = medicalRecord5.getNotes();
        java.lang.String str17 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 32, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        int int15 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!", "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) '4', localDate2, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 0, localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 52, localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 100, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (-1), localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #1 | Date: null | Summary: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 32, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #97 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 0, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getRecordId();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        java.lang.String str16 = medicalRecord5.getSummary();
        java.lang.String str17 = medicalRecord5.getNotes();
        int int18 = medicalRecord5.getPatientId();
        int int19 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.lang.String str17 = medicalRecord5.getNotes();
        java.time.LocalDate localDate18 = medicalRecord5.getDate();
        int int19 = medicalRecord5.getRecordId();
        java.lang.String str20 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str20, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 1, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.String str18 = medicalRecord5.getNotes();
        java.lang.String str19 = medicalRecord5.getSummary();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str20, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (byte) 1, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) 'a', localDate2, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #97 | Patient #97 | Date: null | Summary: Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 32, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (short) 10, localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 10, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str9, "Record #100 | Patient #10 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (-1), localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (-1), localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.toString();
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.getNotes();
        java.lang.String str18 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 10, localDate2, "Record #100 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 32, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #32 | Date: null | Summary: Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #32 | Date: null | Summary: Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.getSummary();
        java.lang.String str17 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 100, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #97 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #97 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #97 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 52, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #97 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) '#', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 97, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) 100, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (-1), localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary: ", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str14, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (byte) 1, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (short) 1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) ' ', localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) ' ', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 0, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 32, localDate2, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 97, localDate2, "", "Record #35 | Patient #100 | Date: null | Summary: hi! | Notes: Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass17 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getRecordId();
        int int17 = medicalRecord5.getRecordId();
        java.lang.String str18 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str18, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 0, localDate2, "Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 97, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (byte) 0, localDate2, "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 97, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localDate11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (-1), localDate2, "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) '#', localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 10, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 100, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) '#', localDate2, "", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        int int16 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) ' ', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #100 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 1, localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) ' ', localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 0, localDate2, "Record #100 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 1, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 97, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 10, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #10 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #10 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 100, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #1 | Patient #97 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 100, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (byte) 100, localDate2, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 35, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 10, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (-1), localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (short) 0, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #0 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) -1, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) '#', localDate2, "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) 'a', localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #32 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (short) 0, localDate2, "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) 'a', localDate2, "", "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 1, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 32, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) -1, localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 35, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 100, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) -1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) 'a', localDate2, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #100 | Date: null | Summary: hi!");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        int int14 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '#', localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        java.lang.String str18 = medicalRecord5.getNotes();
        java.lang.String str19 = medicalRecord5.getSummary();
        int int20 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 10, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 0, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
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
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.lang.String str15 = medicalRecord5.getNotes();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (-1), localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #-1 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #-1 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 97, localDate2, "Record #1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 52, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) -1, localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        int int17 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 32, localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) 'a', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '#', localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        int int16 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 0, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
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
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) 0, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 10, localDate2, "hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 100, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 100, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #1 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 97, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
        java.lang.String str20 = medicalRecord5.getNotes();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.lang.String str17 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass18 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (byte) 0, localDate2, "Record #52 | Patient #35 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #10 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.toString();
        int int16 = medicalRecord5.getPatientId();
        java.lang.String str17 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "", "");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) '4', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) 0, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.getSummary();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getRecordId();
        int int15 = medicalRecord5.getPatientId();
        int int16 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate17 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 32, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) 'a', localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 10, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 97, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 97, localDate2, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 32, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 0, localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #32 | Patient #52 | Date: null | Summary: hi! | Notes: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 0, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 52, localDate2, "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #52 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 100, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 32, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 52, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (byte) 100, localDate2, "", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (-1), localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 52, localDate2, "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 1, localDate2, "Record #0 | Patient #32 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (byte) 100, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
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
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 0, localDate2, "Record #97 | Patient #100 | Date: null | Summary:  | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 0, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) -1, localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str13, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str14, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 100, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) 1, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 10, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #1 | Patient #10 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #1 | Patient #10 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (short) 0, localDate2, "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str16, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
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
        java.lang.String str15 = medicalRecord5.toString();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 35, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 0, localDate2, "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 97, localDate2, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 52, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (byte) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 52, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (byte) -1, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 1, localDate2, "", "Record #0 | Patient #100 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
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
        java.lang.String str18 = medicalRecord5.toString();
        java.time.LocalDate localDate19 = medicalRecord5.getDate();
        java.time.LocalDate localDate20 = medicalRecord5.getDate();
        java.lang.String str21 = medicalRecord5.getSummary();
        int int22 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str18, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertNull(localDate20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) -1, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #-1 | Date: null | Summary: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #1 | Patient #-1 | Date: null | Summary: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 35, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #35 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 97, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #97 | Date: null | Summary: Record #100 | Patient #52 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #97 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #32 | Patient #97 | Date: null | Summary: Record #100 | Patient #52 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #97 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 1, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (-1), localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (-1), localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }
}

