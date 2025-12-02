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
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.Class<?> wildcardClass1 = business0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass3 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass2 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass2 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass2 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass3 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass3 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass3 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass3 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass3 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        boolean boolean11 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.String str10 = business0.dispenseMedicine();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.lang.String str11 = business0.dispenseMedicine();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        java.lang.String str11 = business0.dispenseMedicine();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.String str16 = business0.dispenseMedicine();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.lang.String str11 = business0.dispenseMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        boolean boolean15 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        boolean boolean13 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        boolean boolean15 = business0.isMedicineAvailable();
        boolean boolean16 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass4 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        boolean boolean12 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.String str12 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        java.lang.String str14 = business0.getPrescriptionMedicine();
        boolean boolean15 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        boolean boolean12 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.String str12 = business0.dispenseMedicine();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        boolean boolean10 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        boolean boolean16 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        java.lang.String str15 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.String str14 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.lang.String str14 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.dispenseMedicine();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        boolean boolean12 = business0.isMedicineAvailable();
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.String str13 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        boolean boolean12 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        boolean boolean15 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
        java.lang.String str12 = business0.dispenseMedicine();
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.lang.String str13 = business0.getPrescriptionMedicine();
        java.lang.String str14 = business0.dispenseMedicine();
        java.lang.String str15 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.String str13 = business0.dispenseMedicine();
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.lang.Class<?> wildcardClass14 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.dispenseMedicine();
        boolean boolean15 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.String str11 = business0.dispenseMedicine();
        boolean boolean12 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        java.lang.Class<?> wildcardClass16 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        java.lang.String str16 = business0.dispenseMedicine();
        java.lang.String str17 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Panadol" + "'", str17, "Panadol");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        boolean boolean11 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.String str13 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        boolean boolean10 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.lang.String str13 = business0.dispenseMedicine();
        java.lang.String str14 = business0.getPrescriptionMedicine();
        java.lang.String str15 = business0.getPrescriptionMedicine();
        boolean boolean16 = business0.isMedicineAvailable();
        java.lang.String str17 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str13, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Panadol" + "'", str17, "Panadol");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        boolean boolean14 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass15 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        java.lang.String str12 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass6 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        boolean boolean12 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass9 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.String str15 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Panadol" + "'", str15, "Panadol");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str15, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str16, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.dispenseMedicine();
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.getPrescriptionMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Panadol" + "'", str11, "Panadol");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        boolean boolean13 = business0.isMedicineAvailable();
        java.lang.String str14 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Panadol" + "'", str14, "Panadol");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.dispenseMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass5 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.String str11 = business0.dispenseMedicine();
        java.lang.String str12 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass13 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str11, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.String str10 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Panadol" + "'", str10, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        java.lang.String str10 = business0.dispenseMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.lang.Class<?> wildcardClass11 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass8 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.Class<?> wildcardClass10 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.String str10 = business0.dispenseMedicine();
        java.lang.Class<?> wildcardClass11 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        boolean boolean11 = business0.isMedicineAvailable();
        java.lang.Class<?> wildcardClass12 = business0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.Class<?> wildcardClass7 = business0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

