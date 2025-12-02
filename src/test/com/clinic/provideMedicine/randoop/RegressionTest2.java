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
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.String str16 = business0.dispenseMedicine();
        boolean boolean17 = business0.isMedicineAvailable();
        boolean boolean18 = business0.isMedicineAvailable();
        java.lang.String str19 = business0.dispenseMedicine();
        java.lang.String str20 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str19, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str20, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass15 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Panadol" + "'", str17, "Panadol");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.String str16 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass17 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Panadol" + "'", str16, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
        boolean boolean17 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str17, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.String str16 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Panadol" + "'", str16, "Panadol");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        boolean boolean15 = business0.isMedicineAvailable();
        java.lang.String str16 = business0.getPrescriptionMedicine();
        java.lang.String str17 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Panadol" + "'", str16, "Panadol");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str17, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        java.lang.String str16 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass17 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        java.lang.String str16 = business0.dispenseMedicine();
        java.lang.String str17 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str17, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        java.lang.String str16 = business0.dispenseMedicine();
        boolean boolean17 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.String str16 = business0.getPrescriptionMedicine();
        boolean boolean17 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Panadol" + "'", str16, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.dispenseMedicine();
        boolean boolean18 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str17, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.String str16 = business0.getPrescriptionMedicine();
        boolean boolean17 = business0.isMedicineAvailable();
        java.lang.String str18 = business0.getPrescriptionMedicine();
        boolean boolean19 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Panadol" + "'", str16, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Panadol" + "'", str18, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        java.lang.String str16 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Panadol" + "'", str16, "Panadol");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.String str16 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.dispenseMedicine();
        java.lang.String str18 = business0.dispenseMedicine();
        java.lang.String str19 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str17, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str18, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Panadol" + "'", str19, "Panadol");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
        boolean boolean17 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        boolean boolean16 = business0.isMedicineAvailable();
        boolean boolean17 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass18 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Panadol" + "'", str17, "Panadol");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str17, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass18 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str17, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

