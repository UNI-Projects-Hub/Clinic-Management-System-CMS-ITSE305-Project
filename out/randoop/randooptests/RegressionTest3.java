package randooptests;

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
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) -1, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #0 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) 'a', localDate2, "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 10, localDate2, "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (-1), localDate2, "", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #-1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #35 | Patient #-1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 100, localDate2, "hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #100 | Date: null | Summary: hi! | Notes: Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #35 | Patient #100 | Date: null | Summary: hi! | Notes: Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDate12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 100, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #97 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) -1, localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #-1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #-1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 52, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 52, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 1, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 32, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 0, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.lang.String str17 = medicalRecord5.getSummary();
        java.time.LocalDate localDate18 = medicalRecord5.getDate();
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
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) ' ', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 100, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        java.lang.String str16 = medicalRecord5.toString();
        int int17 = medicalRecord5.getRecordId();
        java.lang.String str18 = medicalRecord5.getNotes();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) 'a', localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        int int18 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate19 = medicalRecord5.getDate();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 1, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (-1), localDate2, "Record #0 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 52, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str9, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str10, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 100, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 0, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 35, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 32, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) 'a', localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) '#', localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) '4', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 100, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str14, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) ' ', localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.lang.String str15 = medicalRecord5.getSummary();
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (-1), localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (short) 10, localDate2, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 10, localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 100, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 0, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #0 | Patient #32 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) '4', localDate2, "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (byte) 100, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getPatientId();
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.getNotes();
        java.time.LocalDate localDate18 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (short) 10, localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 1, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 100, localDate2, "Record #100 | Patient #10 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 35, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #100 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #100 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #100 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #100 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #100 | Date: null | Summary: hi!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) '#', localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
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
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 1, localDate2, "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) '#', localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) 'a', localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) 'a', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 100, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 0, localDate2, "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: ");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) -1, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (byte) 0, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        java.lang.String str16 = medicalRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 35, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: ");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 100, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.lang.Class<?> wildcardClass18 = medicalRecord5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 100, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        java.lang.String str20 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass21 = medicalRecord5.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str20, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        int int17 = medicalRecord5.getRecordId();
        int int18 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 10, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 35, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 1, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: ");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (byte) 100, localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 1, localDate2, "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        int int17 = medicalRecord5.getPatientId();
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
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #52 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        java.lang.String str15 = medicalRecord5.getSummary();
        java.lang.String str16 = medicalRecord5.getNotes();
        int int17 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str20, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #10 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (short) 10, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 35, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        int int14 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        java.lang.String str16 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.getSummary();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 1, localDate2, "", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 32, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) -1, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (short) 0, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        java.lang.String str16 = medicalRecord5.getNotes();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = localDate14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 1, localDate2, "", "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 10, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (byte) 1, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) 10, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        java.lang.String str14 = medicalRecord5.toString();
        int int15 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        java.time.LocalDate localDate17 = medicalRecord5.getDate();
        java.lang.String str18 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str14, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 100, localDate2, "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 35, localDate2, "hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.String str15 = medicalRecord5.toString();
        int int16 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 32, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #35 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
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
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        java.lang.String str16 = medicalRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 35, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str16, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 35, localDate2, "hi!", "Record #1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) '4', localDate2, "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 0, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '4', localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        java.lang.String str15 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 35, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (-1), localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        java.lang.String str15 = medicalRecord5.toString();
        java.lang.String str16 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 0, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (byte) -1, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = localDate11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) -1, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) '4', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) 'a', localDate2, "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) ' ', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = localDate7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) 'a', localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 97, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.toString();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (byte) 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 10, localDate2, "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #10 | Date: null | Summary: ");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 0, localDate2, "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '#', localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 52, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 100, localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) '#', localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) '#', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) 'a', localDate2, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 97, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        int int17 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #97 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 32, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 0, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str19, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 52, localDate2, "hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 10, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 100, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 10, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        java.lang.String str15 = medicalRecord5.toString();
        int int16 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate17 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 35, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 100, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (short) 10, localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (byte) 100, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (byte) 0, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 1, localDate2, "", "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 100, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.toString();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #0 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 32, localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 97, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) ' ', localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 10, localDate2, "", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 10, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getRecordId();
        java.lang.String str16 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (byte) -1, localDate2, "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (short) 0, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 0, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #52 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 10, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (short) 10, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) '#', localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) '4', localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) '4', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 52, localDate2, "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 10, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) '#', localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (short) 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (byte) 1, localDate2, "Record #97 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #97 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 35, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str15, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) '#', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 100, localDate2, "hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) ' ', localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) '#', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (-1), localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #97 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) (short) 1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) 'a', localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #97 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #97 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 0, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

