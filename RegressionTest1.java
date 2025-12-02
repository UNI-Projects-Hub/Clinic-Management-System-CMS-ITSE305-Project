import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        java.lang.String str13 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Panadol" + "'", str13, "Panadol");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str2, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.dispenseMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str10, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        boolean boolean9 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        boolean boolean8 = business0.isMedicineAvailable();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        boolean boolean12 = business0.isMedicineAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.dispenseMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        java.lang.String str12 = business0.getPrescriptionMedicine();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Panadol" + "'", str12, "Panadol");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        boolean boolean10 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
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
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.dispenseMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str8, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str9, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        java.lang.String str12 = business0.dispenseMedicine();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str12, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        boolean boolean5 = business0.isMedicineAvailable();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.dispenseMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str6, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.getPrescriptionMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.dispenseMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Panadol" + "'", str1, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        boolean boolean7 = business0.isMedicineAvailable();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        java.lang.String str9 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Panadol" + "'", str9, "Panadol");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        java.lang.String str14 = business0.dispenseMedicine();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str14, "Medicine 'Panadol' has been successfully dispensed.");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        boolean boolean1 = business0.isMedicineAvailable();
        boolean boolean2 = business0.isMedicineAvailable();
        boolean boolean3 = business0.isMedicineAvailable();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        boolean boolean7 = business0.isMedicineAvailable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        boolean boolean10 = business0.isMedicineAvailable();
        boolean boolean11 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str5, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Panadol" + "'", str7, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.dispenseMedicine();
        java.lang.String str4 = business0.getPrescriptionMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        java.lang.String str8 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str3, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Panadol" + "'", str4, "Panadol");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Panadol" + "'", str8, "Panadol");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        boolean boolean2 = business0.isMedicineAvailable();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        boolean boolean4 = business0.isMedicineAvailable();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        boolean boolean6 = business0.isMedicineAvailable();
        java.lang.String str7 = business0.dispenseMedicine();
        boolean boolean8 = business0.isMedicineAvailable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str7, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
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
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.clinic.provideMedicine.Business business0 = new com.clinic.provideMedicine.Business();
        java.lang.String str1 = business0.dispenseMedicine();
        java.lang.String str2 = business0.getPrescriptionMedicine();
        java.lang.String str3 = business0.getPrescriptionMedicine();
        java.lang.String str4 = business0.dispenseMedicine();
        java.lang.String str5 = business0.getPrescriptionMedicine();
        java.lang.String str6 = business0.getPrescriptionMedicine();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str1, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Panadol" + "'", str2, "Panadol");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Panadol" + "'", str3, "Panadol");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Medicine 'Panadol' has been successfully dispensed." + "'", str4, "Medicine 'Panadol' has been successfully dispensed.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Panadol" + "'", str5, "Panadol");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Panadol" + "'", str6, "Panadol");
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
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
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
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
    }
}

