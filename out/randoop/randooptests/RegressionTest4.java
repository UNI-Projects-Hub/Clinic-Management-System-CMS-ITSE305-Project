package randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) 'a', localDate2, "", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) 'a', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 100, localDate2, "", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) '#', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 10, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 1, localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 10, localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 0, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.lang.String str18 = medicalRecord5.toString();
        int int19 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str18, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 100, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (-1), localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) '#', localDate2, "Record #52 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 97, localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) '4', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 35, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) 10, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (short) 0, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) '4', localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #97 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        java.lang.String str16 = medicalRecord5.getSummary();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 10, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 0, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) '#', localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 35, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) 'a', localDate2, "", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 1, localDate2, "Record #97 | Patient #100 | Date: null | Summary: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        java.time.LocalDate localDate22 = medicalRecord5.getDate();
        int int23 = medicalRecord5.getPatientId();
        java.lang.String str24 = medicalRecord5.getSummary();
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
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 32, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #-1 | Patient #10 | Date: null | Summary: ", "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) 'a', localDate2, "", "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 35, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 32, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #35 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (byte) -1, localDate2, "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 1, localDate2, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 0, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 32, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (short) 10, localDate2, "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.getSummary();
        int int17 = medicalRecord5.getRecordId();
        int int18 = medicalRecord5.getRecordId();
        int int19 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 100, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (-1), localDate2, "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 100, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #100 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #1 | Patient #100 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 10, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getRecordId();
        int int16 = medicalRecord5.getPatientId();
        int int17 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 32, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass18 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 0, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (byte) 0, localDate2, "Record #10 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 97, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 52, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 0, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str13, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 10, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 32, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 10, localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) '4', localDate2, "Record #35 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) -1, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 0, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (short) -1, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (-1), localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 100, localDate2, "Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        java.time.LocalDate localDate18 = medicalRecord5.getDate();
        java.lang.String str19 = medicalRecord5.getSummary();
        int int20 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (byte) 100, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) ' ', localDate2, "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #32 | Date: null | Summary: Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #97 | Patient #32 | Date: null | Summary: Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (-1), localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (-1), localDate2, "", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 1, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '#', localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 10, localDate2, "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
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
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 0, localDate2, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) -1, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) '4', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (-1), localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 100, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (byte) 10, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) '4', localDate2, "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 10, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 97, localDate2, "Record #35 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) ' ', localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (byte) -1, localDate2, "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        java.time.LocalDate localDate17 = medicalRecord5.getDate();
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
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.toString();
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass18 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 10, localDate2, "", "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (-1), localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (-1), localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 1, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 35, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        java.lang.String str18 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass19 = medicalRecord5.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 35, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #35 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #35 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 32, localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) -1, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (short) -1, localDate2, "Record #35 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 10, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 100, localDate2, "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 52, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 100, localDate2, "hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!" + "'", str6, "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 1, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 100, localDate2, "hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!" + "'", str6, "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (short) 100, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str12, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) -1, localDate2, "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.getSummary();
        java.time.LocalDate localDate17 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (short) 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) 1, localDate2, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        java.lang.String str17 = medicalRecord5.toString();
        int int18 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 32, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 1, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) ' ', localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (short) -1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str13, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) '#', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.getSummary();
        int int16 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (short) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 1, localDate2, "Record #35 | Patient #-1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 0, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (short) -1, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #32 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        java.lang.String str16 = medicalRecord5.getNotes();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) '#', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 32, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = localDate18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (-1), localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 32, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 100, localDate2, "Record #10 | Patient #97 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) -1, localDate2, "", "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 1, localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 100, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 97, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (byte) 100, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 100, localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #32 | Patient #100 | Date: null | Summary: Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 35, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) 10, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 0, localDate2, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 0, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 1, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) ' ', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
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
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.getSummary();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (byte) 1, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (-1), localDate2, "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 52, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (-1), localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) -1, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) ' ', localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) -1, localDate2, "Record #97 | Patient #100 | Date: null | Summary: hi!", "Record #10 | Patient #97 | Date: null | Summary: Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (-1), localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "", "");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 100, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 100, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 100, localDate2, "", "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 35, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        java.lang.String str18 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass19 = medicalRecord5.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str18, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #10 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.getNotes();
        int int18 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        int int16 = medicalRecord5.getPatientId();
        int int17 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 10, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        java.lang.String str17 = medicalRecord5.toString();
        java.time.LocalDate localDate18 = medicalRecord5.getDate();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '#', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) 'a', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 35, localDate2, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        java.lang.String str15 = medicalRecord5.toString();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = localDate16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 100, localDate2, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 0, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (-1), localDate2, "Record #52 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 100, localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 1, localDate2, "", "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (-1), localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 100, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        java.time.LocalDate localDate20 = medicalRecord5.getDate();
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
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 1, localDate2, "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 35, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 100, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 10, localDate2, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (-1), localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        int int16 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate17 = medicalRecord5.getDate();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 1, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
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
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (short) 100, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 52, localDate2, "hi!", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) -1, localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        int int16 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 10, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 1, localDate2, "", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 0, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 35, localDate2, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 10, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str12, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 52, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }
}

