package randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getPatientId();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str14, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 0, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #0 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #0 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 52, localDate2, "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 0, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 32, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #32 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 35, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) '4', localDate2, "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 35, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 97, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) '4', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 10, localDate2, "hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 97, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 0, localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 1, localDate2, "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) 'a', localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 10, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #10 | Date: null | Summary: Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #10 | Patient #10 | Date: null | Summary: Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 10, localDate2, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) '#', localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 32, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 1, localDate2, "", "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (short) 100, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (byte) 1, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        java.lang.String str16 = medicalRecord5.getNotes();
        java.lang.String str17 = medicalRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str17, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 32, localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 97, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #52 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 10, localDate2, "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        java.lang.String str18 = medicalRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str18, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) 1, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 1, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 100, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.lang.String str15 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str15, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #97 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 97, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 0, localDate2, "Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '4', localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (-1), localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        int int13 = medicalRecord5.getPatientId();
        int int14 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (byte) 1, localDate2, "Record #97 | Patient #100 | Date: null | Summary:  | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (byte) 0, localDate2, "Record #97 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.lang.String str15 = medicalRecord5.getSummary();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 35, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', (int) (byte) 1, localDate2, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        int int14 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (byte) 100, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) ' ', localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 1, localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 0, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 52, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #1 | Patient #0 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #32 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        java.lang.String str14 = medicalRecord5.getSummary();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (-1), localDate2, "", "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 10, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #100 | Patient #10 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 1, localDate2, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #10 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) '#', localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 1, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #1 | Patient #97 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 52, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (-1), localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, (int) (byte) 100, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        java.lang.String str15 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) 'a', localDate2, "Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 1, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 100, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (short) 10, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (byte) -1, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (short) 100, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 97, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 52, localDate2, "Record #1 | Patient #0 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 97, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #97 | Date: null | Summary: Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #10 | Patient #97 | Date: null | Summary: Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #97 | Date: null | Summary: Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #10 | Patient #97 | Date: null | Summary: Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (short) -1, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #32 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        java.lang.String str17 = medicalRecord5.getNotes();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) -1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #1 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 32, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        java.lang.String str17 = medicalRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 1, localDate2, "Record #-1 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 97, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 97, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        int int16 = medicalRecord5.getPatientId();
        int int17 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (-1), localDate2, "Record #100 | Patient #10 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        java.time.LocalDate localDate15 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 100, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (byte) -1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        int int16 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass14 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.lang.String str16 = medicalRecord5.toString();
        java.lang.String str17 = medicalRecord5.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str16, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str17, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '#', localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '4', localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 97, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #1 | Patient #35 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 52, localDate2, "Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 100, localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass15 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #35 | Patient #97 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, 0, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (byte) 10, localDate2, "Record #1 | Patient #100 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) 1, localDate2, "Record #1 | Patient #97 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 97, localDate2, "", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #97 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #10 | Patient #97 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 10, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getSummary();
        int int13 = medicalRecord5.getRecordId();
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '#', localDate2, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (byte) 1, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 52, localDate2, "Record #35 | Patient #1 | Date: null | Summary: Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) ' ', localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #1 | Date: null | Summary: Record #1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) 'a', localDate2, "", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 10, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (int) ' ', localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #10 | Patient #32 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) '4', localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!" + "'", str6, "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #32 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        int int13 = medicalRecord5.getPatientId();
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
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) ' ', localDate2, "hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (short) -1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #35 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #35 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (byte) 0, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, (-1), localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 52, localDate2, "hi!", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #97 | Patient #100 | Date: null | Summary:  | Notes: Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 0, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(10, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #52 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #100 | Patient #52 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        int int20 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 32, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "Record #100 | Patient #1 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #100 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '#', localDate2, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #35 | Date: null | Summary: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 10, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) 'a', localDate2, "Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 35, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #32 | Patient #10 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #32 | Patient #10 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 1, localDate2, "Record #-1 | Patient #100 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (byte) -1, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, 97, localDate2, "Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) ' ', localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) (byte) 1, localDate2, "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #0 | Patient #32 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, 97, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #52 | Patient #97 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 52, localDate2, "Record #-1 | Patient #52 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str10, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str13, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
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
        java.time.LocalDate localDate17 = medicalRecord5.getDate();
        int int18 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 10, localDate2, "Record #0 | Patient #100 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        int int14 = medicalRecord5.getPatientId();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #100 | Patient #10 | Date: null | Summary: Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) '4', localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #0 | Date: null | Summary: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 10, localDate2, "Record #0 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 52, localDate2, "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 10, localDate2, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #1 | Patient #10 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 100, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #1 | Patient #100 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) 10, localDate2, "", "Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 10, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (byte) -1, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getRecordId();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.toString();
        int int17 = medicalRecord5.getRecordId();
        int int18 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) '#', localDate2, "", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (byte) 100, localDate2, "Record #-1 | Patient #1 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #10 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, 32, localDate2, "Record #35 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 10, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 0, localDate2, "Record #35 | Patient #-1 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        int int15 = medicalRecord5.getRecordId();
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) ' ', localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (byte) 1, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, 0, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getNotes();
        int int10 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 100, localDate2, "Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, 32, localDate2, "Record #52 | Patient #35 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 100, localDate2, "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #100 | Patient #10 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        int int16 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 10, localDate2, "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #10 | Patient #97 | Date: null | Summary: Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 1, 100, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 1, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!", "Record #1 | Patient #100 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 52, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) '4', localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #1 | Date: null | Summary: Record #10 | Patient #0 | Date: null | Summary: Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 1, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #35 | Patient #97 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) '4', localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str7, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 32, localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #32 | Date: null | Summary: Record #32 | Patient #35 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
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
        int int14 = medicalRecord5.getRecordId();
        java.lang.String str15 = medicalRecord5.getNotes();
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 52, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #-1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #-1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #35 | Patient #-1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, 97, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (byte) 10, localDate2, "Record #0 | Patient #100 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!", "");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 100, localDate2, "", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (short) -1, localDate2, "Record #52 | Patient #35 | Date: null | Summary: ", "Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #-1 | Date: null | Summary: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #32 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) '4', localDate2, "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 0, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
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
        java.time.LocalDate localDate16 = medicalRecord5.getDate();
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
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        java.lang.String str15 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass16 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 100, localDate2, "", "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '4', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) '#', localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (short) 100, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #100 | Date: null | Summary: hi!" + "'", str6, "Record #97 | Patient #100 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #100 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #100 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) ' ', localDate2, "Record #10 | Patient #0 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 97, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        java.lang.String str14 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str14, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, (int) (short) 100, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 100, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (short) 100, localDate2, "Record #100 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        int int15 = medicalRecord5.getPatientId();
        java.lang.String str16 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str16, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 52, localDate2, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #97 | Patient #10 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str7, "Record #97 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.toString();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str11, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) 'a', localDate2, "", "Record #97 | Patient #-1 | Date: null | Summary: Record #1 | Patient #32 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.toString();
        int int12 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass13 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) 'a', localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (byte) 0, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (byte) 1, localDate2, "Record #100 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #10 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getSummary();
        java.lang.String str13 = medicalRecord5.getNotes();
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) (short) 0, localDate2, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, (int) (short) -1, localDate2, "Record #97 | Patient #97 | Date: null | Summary: Record #32 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #1 | Patient #10 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) 'a', localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #10 | Patient #35 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass7 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, (int) ' ', localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (short) 10, localDate2, "Record #100 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #97 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.Class<?> wildcardClass6 = medicalRecord5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        java.lang.String str18 = medicalRecord5.getNotes();
        java.lang.String str19 = medicalRecord5.toString();
        java.lang.String str20 = medicalRecord5.getNotes();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str19, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDate12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getSummary();
        int int9 = medicalRecord5.getPatientId();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        int int12 = medicalRecord5.getRecordId();
        java.lang.String str13 = medicalRecord5.toString();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (short) 0, localDate2, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        java.lang.String str15 = medicalRecord5.getSummary();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        int int19 = medicalRecord5.getRecordId();
        int int20 = medicalRecord5.getPatientId();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', (int) (byte) 100, localDate2, "", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        java.lang.String str8 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 0, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.toString();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.lang.String str14 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str13, "Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str14, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, 32, localDate2, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 35, localDate2, "Record #1 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #1 | Patient #1 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(32, (int) (short) -1, localDate2, "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #32 | Date: null | Summary: Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) (short) 100, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        int int7 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.getSummary();
        java.lang.String str14 = medicalRecord5.getNotes();
        int int15 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (byte) 100, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        int int7 = medicalRecord5.getRecordId();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 1, localDate2, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #1 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #100 | Patient #1 | Date: null | Summary: Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        java.lang.String str19 = medicalRecord5.getNotes();
        java.lang.String str20 = medicalRecord5.getNotes();
        int int21 = medicalRecord5.getPatientId();
        int int22 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '#', 97, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) 'a', localDate2, "", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 1, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), 32, localDate2, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #-1 | Patient #32 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.getNotes();
        java.lang.String str13 = medicalRecord5.toString();
        java.time.LocalDate localDate14 = medicalRecord5.getDate();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str8, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str13, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) -1, (int) '4', localDate2, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, 0, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass8 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) ' ', localDate2, "Record #-1 | Patient #100 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #97 | Patient #97 | Date: null | Summary: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getPatientId();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str12, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.getSummary();
        java.lang.String str9 = medicalRecord5.toString();
        int int10 = medicalRecord5.getRecordId();
        int int11 = medicalRecord5.getRecordId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 100, (int) (short) 10, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #0 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #32 | Patient #0 | Date: null | Summary: Record #100 | Patient #100 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #32 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: Record #0 | Patient #100 | Date: null | Summary:  | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        int int16 = medicalRecord5.getRecordId();
        java.lang.String str17 = medicalRecord5.toString();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str17, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, 100, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #100 | Patient #100 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #100 | Patient #100 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        int int13 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (-1), localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getRecordId();
        java.lang.String str12 = medicalRecord5.toString();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        java.lang.String str14 = medicalRecord5.toString();
        int int15 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str14, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) '4', 1, localDate2, "", "Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(97, (int) (byte) 1, localDate2, "Record #1 | Patient #10 | Date: null | Summary: Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) 'a', localDate2, "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #52 | Patient #52 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #-1 | Patient #100 | Date: null | Summary: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 10, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 0, localDate2, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.lang.String str12 = medicalRecord5.toString();
        java.lang.String str13 = medicalRecord5.getNotes();
        java.lang.String str14 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str12, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', (int) (byte) 10, localDate2, "hi!", "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getSummary();
        int int10 = medicalRecord5.getPatientId();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.time.LocalDate localDate8 = medicalRecord5.getDate();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.toString();
        java.lang.String str11 = medicalRecord5.getNotes();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str8, "Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getSummary();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getNotes();
        java.lang.Class<?> wildcardClass11 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (short) 0, localDate2, "Record #1 | Patient #100 | Date: null | Summary: Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "Record #1 | Patient #0 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #10 | Date: null | Summary: Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', 10, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #100 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #52 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) (byte) 100, localDate2, "Record #0 | Patient #10 | Date: null | Summary: Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #-1 | Date: null | Summary: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi! | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, 0, localDate2, "Record #97 | Patient #1 | Date: null | Summary: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) -1, (int) ' ', localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #32 | Patient #10 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getSummary();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #-1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) ' ', localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getPatientId();
        int int9 = medicalRecord5.getPatientId();
        int int10 = medicalRecord5.getRecordId();
        java.lang.String str11 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str11, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 1, 52, localDate2, "Record #0 | Patient #-1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #32 | Patient #1 | Date: null | Summary:  | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        int int20 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((-1), (int) (short) 1, localDate2, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #1 | Date: null | Summary: ");
        java.lang.String str6 = medicalRecord5.toString();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.toString();
        java.lang.String str10 = medicalRecord5.getSummary();
        java.lang.String str11 = medicalRecord5.toString();
        java.lang.String str12 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str9, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str10, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str11, "Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: " + "'", str12, "Record #0 | Patient #1 | Date: null | Summary: ");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, (int) (byte) 1, localDate2, "Record #0 | Patient #1 | Date: null | Summary: hi!", "Record #10 | Patient #1 | Date: null | Summary: Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #1 | Date: null | Summary: hi!" + "'", str6, "Record #0 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(52, 100, localDate2, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        int int8 = medicalRecord5.getRecordId();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        int int11 = medicalRecord5.getPatientId();
        int int12 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str9, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getPatientId();
        int int7 = medicalRecord5.getRecordId();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.String str9 = medicalRecord5.getNotes();
        java.lang.String str10 = medicalRecord5.getSummary();
        int int11 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        int int13 = medicalRecord5.getRecordId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 100, localDate2, "Record #0 | Patient #1 | Date: null | Summary: ", "Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.toString();
        int int8 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str7, "Record #0 | Patient #100 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 100, (int) (short) -1, localDate2, "", "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getPatientId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (short) 1, localDate2, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ", "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getSummary();
        int int8 = medicalRecord5.getPatientId();
        java.lang.String str9 = medicalRecord5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str6, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: " + "'", str7, "Record #35 | Patient #10 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #0 | Patient #1 | Date: null | Summary: ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!" + "'", str9, "Record #52 | Patient #1 | Date: null | Summary: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: hi!");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) ' ', 1, localDate2, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!", "hi!");
        java.lang.String str6 = medicalRecord5.getSummary();
        int int7 = medicalRecord5.getPatientId();
        int int8 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.Class<?> wildcardClass10 = medicalRecord5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!" + "'", str6, "Record #-1 | Patient #1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(100, (int) '4', localDate2, "Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!", "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str7, "Record #35 | Patient #97 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi!");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, (int) (short) -1, localDate2, "", "hi!");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        int int7 = medicalRecord5.getPatientId();
        java.lang.String str8 = medicalRecord5.toString();
        int int9 = medicalRecord5.getRecordId();
        int int10 = medicalRecord5.getPatientId();
        java.lang.String str11 = medicalRecord5.getSummary();
        int int12 = medicalRecord5.getPatientId();
        java.lang.String str13 = medicalRecord5.getSummary();
        int int14 = medicalRecord5.getRecordId();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 10, (int) (short) 0, localDate2, "Record #-1 | Patient #-1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary:  | Notes: Record #100 | Patient #97 | Date: null | Summary: hi! | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(1, (int) (byte) 1, localDate2, "Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        int int6 = medicalRecord5.getRecordId();
        java.time.LocalDate localDate7 = medicalRecord5.getDate();
        java.lang.String str8 = medicalRecord5.toString();
        java.lang.Class<?> wildcardClass9 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!" + "'", str8, "Record #1 | Patient #1 | Date: null | Summary: Record #52 | Patient #100 | Date: null | Summary: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi! | Notes: Record #100 | Patient #97 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(35, (int) (byte) 1, localDate2, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!", "");
        java.lang.String str6 = medicalRecord5.getSummary();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!" + "'", str6, "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: Record #0 | Patient #0 | Date: null | Summary: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: hi!");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord(0, 1, localDate2, "Record #35 | Patient #0 | Date: null | Summary: Record #0 | Patient #1 | Date: null | Summary:  | Notes: Record #97 | Patient #1 | Date: null | Summary: hi! | Notes: Record #-1 | Patient #97 | Date: null | Summary:  | Notes: Record #52 | Patient #35 | Date: null | Summary:  | Notes: Record #10 | Patient #52 | Date: null | Summary: hi! | Notes: Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!", "Record #0 | Patient #-1 | Date: null | Summary:  | Notes: hi!");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (byte) 0, (int) (byte) 1, localDate2, "", "");
        int int6 = medicalRecord5.getPatientId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        java.lang.String str10 = medicalRecord5.getNotes();
        int int11 = medicalRecord5.getRecordId();
        java.lang.Class<?> wildcardClass12 = medicalRecord5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        int int6 = medicalRecord5.getRecordId();
        java.lang.String str7 = medicalRecord5.getNotes();
        int int8 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate9 = medicalRecord5.getDate();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) (short) 0, 0, localDate2, "", "hi!");
        java.lang.String str6 = medicalRecord5.getNotes();
        java.lang.String str7 = medicalRecord5.getNotes();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.toString();
        java.time.LocalDate localDate10 = medicalRecord5.getDate();
        java.lang.String str11 = medicalRecord5.getNotes();
        java.time.LocalDate localDate12 = medicalRecord5.getDate();
        java.time.LocalDate localDate13 = medicalRecord5.getDate();
        int int14 = medicalRecord5.getPatientId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!" + "'", str9, "Record #0 | Patient #0 | Date: null | Summary:  | Notes: hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.time.LocalDate localDate2 = null;
        domain.MedicalRecord medicalRecord5 = new domain.MedicalRecord((int) 'a', (int) (short) 1, localDate2, "hi!", "");
        java.time.LocalDate localDate6 = medicalRecord5.getDate();
        java.lang.String str7 = medicalRecord5.getSummary();
        java.lang.String str8 = medicalRecord5.getNotes();
        java.lang.String str9 = medicalRecord5.getSummary();
        java.lang.String str10 = medicalRecord5.toString();
        java.time.LocalDate localDate11 = medicalRecord5.getDate();
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Record #97 | Patient #1 | Date: null | Summary: hi!" + "'", str10, "Record #97 | Patient #1 | Date: null | Summary: hi!");
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
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
        java.lang.String str17 = medicalRecord5.getSummary();
        int int18 = medicalRecord5.getPatientId();
        java.time.LocalDate localDate19 = medicalRecord5.getDate();
        int int20 = medicalRecord5.getRecordId();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }
}

