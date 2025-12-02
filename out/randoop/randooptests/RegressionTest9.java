package randooptests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.Class<?> wildcardClass6 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}'}" + "'", str4, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str5, "Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=52, fullName='Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.getFullName();
        int int10 = patient2.getId();
        java.lang.String str11 = patient2.getFullName();
        java.lang.String str12 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName=''}" + "'", str4, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=10, fullName=''}" + "'", str8, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        domain.Patient patient2 = new domain.Patient(1, "");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName=''}" + "'", str3, "Patient{id=1, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='hi!'}" + "'", str3, "Patient{id=10, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        domain.Patient patient2 = new domain.Patient(32, "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=-1, fullName='Patient{id=52, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=52, fullName=''}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=52, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str6, "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str7, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str8, "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=100, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName=''}" + "'", str3, "Patient{id=100, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName=''}" + "'", str4, "Patient{id=100, fullName=''}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=100, fullName=''}" + "'", str6, "Patient{id=100, fullName=''}");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=97, fullName='Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}'}");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName=''}" + "'", str3, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=97, fullName=''}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=10, fullName=''}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName=''}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=10, fullName=''}'}");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=-1, fullName='Patient{id=32, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=32, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=32, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}'}'}");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=1, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=-1, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.Class<?> wildcardClass10 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}'}");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=1, fullName='Patient{id=-1, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=-1, fullName=''}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=-1, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str3, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str7, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        domain.Patient patient2 = new domain.Patient((int) 'a', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        java.lang.String str10 = patient2.toString();
        java.lang.String str11 = patient2.getFullName();
        java.lang.String str12 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=97, fullName=''}" + "'", str10, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        int int7 = patient2.getId();
        int int8 = patient2.getId();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=97, fullName='Patient{id=100, fullName='hi!'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=97, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=97, fullName='Patient{id=100, fullName='hi!'}'}'}");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=100, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=97, fullName='Patient{id=0, fullName=''}'}");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=10, fullName='hi!'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=100, fullName='Patient{id=100, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=100, fullName=''}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=100, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName=''}" + "'", str3, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName=''}" + "'", str4, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName=''}" + "'", str7, "Patient{id=10, fullName=''}");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=32, fullName='Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=32, fullName='Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}'}'}" + "'", str3, "Patient{id=32, fullName='Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}'}'}");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=1, fullName='Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}'}'}");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=0, fullName='hi!'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str6, "Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        domain.Patient patient2 = new domain.Patient((int) ' ', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=32, fullName=''}" + "'", str7, "Patient{id=32, fullName=''}");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        domain.Patient patient2 = new domain.Patient(100, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str3, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str6, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=32, fullName='hi!'}'}'}");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=32, fullName='Patient{id=-1, fullName='Patient{id=32, fullName='hi!'}'}'}");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.toString();
        java.lang.String str11 = patient2.getFullName();
        java.lang.Class<?> wildcardClass12 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName=''}" + "'", str3, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=97, fullName=''}" + "'", str7, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=97, fullName=''}" + "'", str8, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str9, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str10, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Patient{id=97, fullName=''}" + "'", str11, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        domain.Patient patient2 = new domain.Patient(32, "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=97, fullName=''}'}'}");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        domain.Patient patient2 = new domain.Patient(10, "");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName=''}" + "'", str4, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName=''}" + "'", str5, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName=''}" + "'", str7, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=10, fullName=''}" + "'", str8, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.getFullName();
        java.lang.String str11 = patient2.toString();
        java.lang.String str12 = patient2.getFullName();
        java.lang.String str13 = patient2.getFullName();
        java.lang.Class<?> wildcardClass14 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str8, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str9, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str11, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str12, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str13, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}'}");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str5, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=32, fullName='Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=32, fullName='Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=32, fullName='Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=32, fullName='hi!'}");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=52, fullName=''}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName=''}" + "'", str4, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=52, fullName=''}" + "'", str6, "Patient{id=52, fullName=''}");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=32, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        int int8 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str3, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=32, fullName='hi!'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=32, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str5, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str6, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str7, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=35, fullName='Patient{id=100, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=100, fullName=''}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=100, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=100, fullName=''}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=100, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=32, fullName='Patient{id=35, fullName='Patient{id=100, fullName=''}'}'}" + "'", str5, "Patient{id=32, fullName='Patient{id=35, fullName='Patient{id=100, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=35, fullName='Patient{id=100, fullName=''}'}" + "'", str6, "Patient{id=35, fullName='Patient{id=100, fullName=''}'}");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=1, fullName='Patient{id=52, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=52, fullName=''}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=52, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str7, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str8, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=35, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=35, fullName=''}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=35, fullName=''}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=35, fullName=''}'}");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=100, fullName=''}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.Class<?> wildcardClass7 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=100, fullName=''}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=100, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=100, fullName=''}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=100, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=100, fullName=''}" + "'", str5, "Patient{id=100, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=100, fullName=''}" + "'", str6, "Patient{id=100, fullName=''}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        domain.Patient patient2 = new domain.Patient((int) '#', "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        domain.Patient patient2 = new domain.Patient((int) 'a', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName=''}" + "'", str5, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=97, fullName=''}" + "'", str6, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=100, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str3, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        domain.Patient patient2 = new domain.Patient(52, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='hi!'}" + "'", str3, "Patient{id=52, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        java.lang.String str10 = patient2.getFullName();
        java.lang.String str11 = patient2.toString();
        java.lang.String str12 = patient2.getFullName();
        java.lang.String str13 = patient2.getFullName();
        java.lang.Class<?> wildcardClass14 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str11, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=100, fullName='hi!'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.Class<?> wildcardClass6 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str5, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=97, fullName='Patient{id=100, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        domain.Patient patient2 = new domain.Patient((int) 'a', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        java.lang.String str10 = patient2.toString();
        java.lang.String str11 = patient2.getFullName();
        java.lang.Class<?> wildcardClass12 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=97, fullName=''}" + "'", str10, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str5, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=52, fullName=''}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=32, fullName='Patient{id=52, fullName=''}'}" + "'", str4, "Patient{id=32, fullName='Patient{id=52, fullName=''}'}");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        java.lang.Class<?> wildcardClass8 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName=''}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName=''}" + "'", str5, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName=''}'}" + "'", str6, "Patient{id=-1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='Patient{id=35, fullName='Patient{id=100, fullName=''}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=-1, fullName='Patient{id=97, fullName=''}'}'}'}");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=100, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str3, "Patient{id=100, fullName='hi!'}");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.getFullName();
        java.lang.String str11 = patient2.toString();
        int int12 = patient2.getId();
        java.lang.String str13 = patient2.toString();
        java.lang.String str14 = patient2.toString();
        java.lang.Class<?> wildcardClass15 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str11, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str13, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str14, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        domain.Patient patient2 = new domain.Patient((int) 'a', "");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=0, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName=''}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str5, "Patient{id=97, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=10, fullName='Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}'}");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=100, fullName='Patient{id=35, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.Class<?> wildcardClass7 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=35, fullName=''}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=35, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str6, "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.Class<?> wildcardClass8 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        domain.Patient patient2 = new domain.Patient(32, "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}" + "'", str5, "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}" + "'", str6, "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}" + "'", str7, "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str8, "Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str9, "Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        domain.Patient patient2 = new domain.Patient(1, "Patient{id=35, fullName='Patient{id=35, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str3, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str4, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str7, "Patient{id=100, fullName='hi!'}");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.toString();
        int int11 = patient2.getId();
        int int12 = patient2.getId();
        int int13 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.toString();
        int int8 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str6, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str7, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=-1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        domain.Patient patient2 = new domain.Patient(32, "Patient{id=32, fullName='Patient{id=52, fullName=''}'}");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=35, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        domain.Patient patient2 = new domain.Patient(1, "Patient{id=97, fullName='Patient{id=-1, fullName=''}'}");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}" + "'", str4, "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=97, fullName='Patient{id=100, fullName='hi!'}'}");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        java.lang.Class<?> wildcardClass6 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=97, fullName=''}'}'}'}");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        int int10 = patient2.getId();
        java.lang.String str11 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName=''}" + "'", str3, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=97, fullName=''}" + "'", str7, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=97, fullName=''}" + "'", str8, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str11, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=35, fullName=''}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=35, fullName=''}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=35, fullName=''}'}");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=35, fullName='Patient{id=100, fullName='hi!'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=100, fullName='hi!'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=0, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str6, "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str7, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=100, fullName='Patient{id=0, fullName=''}'}");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=32, fullName='hi!'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str4, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        int int10 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=-1, fullName=''}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=-1, fullName=''}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=-1, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=-1, fullName=''}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=-1, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=35, fullName='Patient{id=100, fullName='hi!'}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=35, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=35, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str5, "Patient{id=35, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        domain.Patient patient2 = new domain.Patient(100, "");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=32, fullName='Patient{id=97, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        domain.Patient patient2 = new domain.Patient(1, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}'}");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=-1, fullName=''}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.getFullName();
        int int11 = patient2.getId();
        java.lang.String str12 = patient2.toString();
        java.lang.String str13 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str12, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        int int9 = patient2.getId();
        java.lang.Class<?> wildcardClass10 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str4, "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName=''}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName=''}'}" + "'", str6, "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName=''}'}" + "'", str7, "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=100, fullName='Patient{id=97, fullName=''}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        domain.Patient patient2 = new domain.Patient((int) '4', "");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName=''}" + "'", str4, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=52, fullName=''}" + "'", str7, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=52, fullName=''}" + "'", str8, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=52, fullName=''}" + "'", str9, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        domain.Patient patient2 = new domain.Patient(52, "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        int int6 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName=''}" + "'", str4, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=52, fullName=''}" + "'", str5, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=35, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str5, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str6, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName=''}" + "'", str3, "Patient{id=-1, fullName=''}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=-1, fullName=''}" + "'", str6, "Patient{id=-1, fullName=''}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=-1, fullName=''}" + "'", str8, "Patient{id=-1, fullName=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=-1, fullName=''}" + "'", str9, "Patient{id=-1, fullName=''}");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=100, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        domain.Patient patient2 = new domain.Patient(1, "Patient{id=32, fullName='Patient{id=97, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=32, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=-1, fullName='Patient{id=-1, fullName=''}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=35, fullName=''}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        java.lang.String str10 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=32, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}'}" + "'", str3, "Patient{id=32, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        java.lang.Class<?> wildcardClass6 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=35, fullName='Patient{id=35, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=35, fullName=''}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=35, fullName=''}'}'}");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}'}");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='hi!'}'}'}");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=97, fullName='Patient{id=-1, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=97, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str6, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str7, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str8, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=52, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        domain.Patient patient2 = new domain.Patient(35, "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName=''}" + "'", str4, "Patient{id=35, fullName=''}");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        domain.Patient patient2 = new domain.Patient((int) 'a', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        int int9 = patient2.getId();
        int int10 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=97, fullName=''}" + "'", str7, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=97, fullName=''}" + "'", str8, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=97, fullName='Patient{id=10, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=52, fullName=''}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.getFullName();
        java.lang.String str10 = patient2.getFullName();
        java.lang.String str11 = patient2.getFullName();
        java.lang.String str12 = patient2.getFullName();
        java.lang.String str13 = patient2.toString();
        java.lang.String str14 = patient2.toString();
        int int15 = patient2.getId();
        int int16 = patient2.getId();
        int int17 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str13, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str14, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        domain.Patient patient2 = new domain.Patient((int) '#', "Patient{id=0, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.getFullName();
        java.lang.String str9 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName=''}" + "'", str5, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName=''}" + "'", str7, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=0, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName=''}" + "'", str3, "Patient{id=0, fullName=''}");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=100, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=0, fullName='Patient{id=35, fullName=''}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        domain.Patient patient2 = new domain.Patient(10, "Patient{id=1, fullName='Patient{id=-1, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}'}");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        int int8 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        domain.Patient patient2 = new domain.Patient((int) ' ', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        domain.Patient patient2 = new domain.Patient(1, "Patient{id=-1, fullName='Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=97, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=97, fullName='Patient{id=97, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}" + "'", str4, "Patient{id=97, fullName='Patient{id=97, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=1, fullName='Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}'}'}");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=32, fullName='Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=97, fullName=''}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        java.lang.String str9 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str6, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=97, fullName=''}" + "'", str8, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str9, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=100, fullName='Patient{id=10, fullName='hi!'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=10, fullName='hi!'}'}");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        domain.Patient patient2 = new domain.Patient((int) '#', "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=1, fullName='Patient{id=32, fullName='hi!'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=1, fullName='Patient{id=32, fullName='hi!'}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=1, fullName='Patient{id=32, fullName='hi!'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str6, "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=32, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=52, fullName='Patient{id=52, fullName='Patient{id=32, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        domain.Patient patient2 = new domain.Patient(10, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='hi!'}" + "'", str3, "Patient{id=10, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='hi!'}" + "'", str4, "Patient{id=10, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        java.lang.Class<?> wildcardClass7 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName=''}" + "'", str3, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=97, fullName=''}" + "'", str6, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.getFullName();
        int int8 = patient2.getId();
        java.lang.String str9 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=32, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str3, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str4, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        domain.Patient patient2 = new domain.Patient(1, "Patient{id=100, fullName='Patient{id=-1, fullName=''}'}");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        domain.Patient patient2 = new domain.Patient((int) '#', "Patient{id=1, fullName='Patient{id=52, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=52, fullName=''}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=52, fullName=''}'}");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=32, fullName='Patient{id=10, fullName='hi!'}'}");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str5, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str6, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        java.lang.Class<?> wildcardClass6 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str5, "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}" + "'", str6, "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        int int7 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}" + "'", str6, "Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}'}");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        domain.Patient patient2 = new domain.Patient(1, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=10, fullName=''}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        domain.Patient patient2 = new domain.Patient((int) 'a', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=97, fullName=''}" + "'", str4, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=10, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='hi!'}" + "'", str3, "Patient{id=10, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str4, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName='hi!'}" + "'", str7, "Patient{id=10, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str8, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=10, fullName='hi!'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=10, fullName='hi!'}" + "'", str6, "Patient{id=10, fullName='hi!'}");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=32, fullName='hi!'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=32, fullName='hi!'}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=32, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=32, fullName='hi!'}" + "'", str4, "Patient{id=32, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=32, fullName='hi!'}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=32, fullName='hi!'}'}");
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=0, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName=''}" + "'", str3, "Patient{id=0, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName=''}" + "'", str4, "Patient{id=0, fullName=''}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=97, fullName='Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}'}" + "'", str4, "Patient{id=97, fullName='Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=0, fullName='hi!'}'}'}'}'}");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=0, fullName=''}'}'}");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        domain.Patient patient2 = new domain.Patient((int) 'a', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        java.lang.String str9 = patient2.getFullName();
        int int10 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=100, fullName='Patient{id=35, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=35, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=35, fullName=''}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=35, fullName=''}'}");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        int int8 = patient2.getId();
        int int9 = patient2.getId();
        java.lang.String str10 = patient2.toString();
        int int11 = patient2.getId();
        java.lang.String str12 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str10, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str12, "Patient{id=0, fullName='hi!'}");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=10, fullName='Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='hi!'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='hi!'}'}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        domain.Patient patient2 = new domain.Patient((int) '#', "Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=97, fullName='Patient{id=100, fullName=''}'}");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        domain.Patient patient2 = new domain.Patient((int) '#', "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.toString();
        java.lang.Class<?> wildcardClass7 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=35, fullName=''}" + "'", str6, "Patient{id=35, fullName=''}");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=97, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=35, fullName=''}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=35, fullName=''}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=35, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=35, fullName=''}" + "'", str5, "Patient{id=35, fullName=''}");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=1, fullName='Patient{id=32, fullName='hi!'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=32, fullName='hi!'}'}'}" + "'", str4, "Patient{id=32, fullName='Patient{id=1, fullName='Patient{id=32, fullName='hi!'}'}'}");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.Class<?> wildcardClass6 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}" + "'", str4, "Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}'}" + "'", str5, "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName=''}" + "'", str4, "Patient{id=1, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=-1, fullName='Patient{id=52, fullName='Patient{id=35, fullName='Patient{id=100, fullName=''}'}'}'}");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=0, fullName='Patient{id=32, fullName='hi!'}'}");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.getFullName();
        java.lang.String str10 = patient2.toString();
        java.lang.String str11 = patient2.toString();
        int int12 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str11, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=10, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        domain.Patient patient2 = new domain.Patient(10, "");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.getFullName();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.toString();
        int int11 = patient2.getId();
        java.lang.Class<?> wildcardClass12 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=10, fullName=''}" + "'", str4, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName=''}" + "'", str5, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=10, fullName=''}" + "'", str7, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=10, fullName=''}" + "'", str9, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=10, fullName=''}" + "'", str10, "Patient{id=10, fullName=''}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str3, "Patient{id=97, fullName='Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=97, fullName=''}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=97, fullName=''}" + "'", str4, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName=''}" + "'", str5, "Patient{id=97, fullName=''}");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=100, fullName='hi!'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.getFullName();
        java.lang.Class<?> wildcardClass9 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=97, fullName=''}" + "'", str3, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='Patient{id=97, fullName=''}'}" + "'", str7, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=97, fullName=''}" + "'", str8, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}" + "'", str6, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=0, fullName='Patient{id=97, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.toString();
        java.lang.Class<?> wildcardClass8 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}" + "'", str3, "Patient{id=0, fullName='Patient{id=-1, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str6, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str7, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='Patient{id=97, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}'}");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=0, fullName='Patient{id=35, fullName='Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}'}");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        domain.Patient patient2 = new domain.Patient((int) '4', "");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        int int7 = patient2.getId();
        int int8 = patient2.getId();
        java.lang.Class<?> wildcardClass9 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName=''}" + "'", str4, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='hi!'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str6, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str7, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=32, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=35, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=-1, fullName='Patient{id=52, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=100, fullName='Patient{id=32, fullName='Patient{id=-1, fullName='Patient{id=32, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        int int7 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=97, fullName=''}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName=''}" + "'", str5, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=97, fullName=''}" + "'", str6, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=10, fullName='Patient{id=-1, fullName='Patient{id=97, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=97, fullName='Patient{id=97, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=1, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=0, fullName='hi!'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        java.lang.String str7 = patient2.getFullName();
        int int8 = patient2.getId();
        java.lang.String str9 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str5, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str6, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        java.lang.Class<?> wildcardClass6 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=10, fullName=''}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=35, fullName='Patient{id=10, fullName=''}'}" + "'", str5, "Patient{id=35, fullName='Patient{id=10, fullName=''}'}");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}" + "'", str5, "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=97, fullName=''}'}'}");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.getFullName();
        int int8 = patient2.getId();
        int int9 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=100, fullName='Patient{id=-1, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=35, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=35, fullName=''}'}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=35, fullName=''}'}'}");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=52, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName=''}" + "'", str3, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName=''}" + "'", str4, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=52, fullName=''}" + "'", str5, "Patient{id=52, fullName=''}");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.getFullName();
        int int11 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str6, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str8, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str9, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=52, fullName='Patient{id=35, fullName=''}'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        int int8 = patient2.getId();
        java.lang.String str9 = patient2.toString();
        java.lang.String str10 = patient2.toString();
        java.lang.String str11 = patient2.getFullName();
        java.lang.String str12 = patient2.getFullName();
        java.lang.Class<?> wildcardClass13 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        domain.Patient patient2 = new domain.Patient((-1), "hi!");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=-1, fullName='hi!'}" + "'", str8, "Patient{id=-1, fullName='hi!'}");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=0, fullName='hi!'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        int int8 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        domain.Patient patient2 = new domain.Patient((int) '#', "Patient{id=97, fullName='Patient{id=10, fullName=''}'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.Class<?> wildcardClass7 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=97, fullName='Patient{id=10, fullName=''}'}" + "'", str5, "Patient{id=97, fullName='Patient{id=10, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}" + "'", str5, "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=32, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=100, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        int int8 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName=''}" + "'", str3, "Patient{id=100, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName=''}" + "'", str4, "Patient{id=100, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=100, fullName=''}" + "'", str5, "Patient{id=100, fullName=''}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.getFullName();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName=''}" + "'", str3, "Patient{id=1, fullName=''}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        domain.Patient patient2 = new domain.Patient((int) ' ', "Patient{id=-1, fullName='Patient{id=0, fullName='hi!'}'}");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=97, fullName='Patient{id=100, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=97, fullName='Patient{id=100, fullName=''}'}'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=97, fullName='Patient{id=100, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=10, fullName='Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=35, fullName=''}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=35, fullName=''}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=35, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=35, fullName=''}" + "'", str5, "Patient{id=35, fullName=''}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=35, fullName=''}" + "'", str6, "Patient{id=35, fullName=''}");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=97, fullName='Patient{id=32, fullName='Patient{id=52, fullName='Patient{id=100, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=0, fullName='Patient{id=97, fullName=''}'}'}");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        domain.Patient patient2 = new domain.Patient((int) '#', "Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}'}" + "'", str3, "Patient{id=35, fullName='Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}'}");
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        domain.Patient patient2 = new domain.Patient((int) (short) 10, "Patient{id=100, fullName='Patient{id=35, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}'}");
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=32, fullName=''}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=32, fullName=''}" + "'", str3, "Patient{id=32, fullName=''}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=32, fullName=''}" + "'", str5, "Patient{id=32, fullName=''}");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        domain.Patient patient2 = new domain.Patient(32, "Patient{id=97, fullName='Patient{id=100, fullName=''}'}");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        domain.Patient patient2 = new domain.Patient((int) (byte) 0, "Patient{id=35, fullName='Patient{id=1, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}'}");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}" + "'", str3, "Patient{id=52, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.toString();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName=''}" + "'", str3, "Patient{id=-1, fullName=''}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName=''}" + "'", str5, "Patient{id=-1, fullName=''}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=10, fullName='Patient{id=97, fullName=''}'}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        int int6 = patient2.getId();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        java.lang.String str10 = patient2.toString();
        int int11 = patient2.getId();
        java.lang.Class<?> wildcardClass12 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        domain.Patient patient2 = new domain.Patient(100, "Patient{id=0, fullName='hi!'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.toString();
        java.lang.Class<?> wildcardClass8 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str5, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str7, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        domain.Patient patient2 = new domain.Patient(10, "hi!");
        int int3 = patient2.getId();
        java.lang.Class<?> wildcardClass4 = patient2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}'}" + "'", str4, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=10, fullName='Patient{id=32, fullName='hi!'}'}'}");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        domain.Patient patient2 = new domain.Patient((int) '4', "Patient{id=10, fullName='Patient{id=1, fullName='Patient{id=-1, fullName='Patient{id=32, fullName='Patient{id=97, fullName=''}'}'}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=35, fullName='Patient{id=97, fullName='Patient{id=-1, fullName='Patient{id=100, fullName='hi!'}'}'}'}");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=97, fullName=''}'}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=35, fullName='Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=97, fullName=''}'}'}'}'}" + "'", str4, "Patient{id=35, fullName='Patient{id=100, fullName='Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=97, fullName=''}'}'}'}'}");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        domain.Patient patient2 = new domain.Patient(100, "hi!");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str3, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str7, "Patient{id=100, fullName='hi!'}");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=1, fullName='Patient{id=35, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        domain.Patient patient2 = new domain.Patient(10, "");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        domain.Patient patient2 = new domain.Patient((int) (byte) 10, "Patient{id=1, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        java.lang.String str9 = patient2.toString();
        int int10 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str6, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str9, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        domain.Patient patient2 = new domain.Patient((int) (short) -1, "Patient{id=100, fullName='Patient{id=100, fullName=''}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        domain.Patient patient2 = new domain.Patient((int) 'a', "Patient{id=35, fullName='Patient{id=0, fullName='Patient{id=52, fullName='Patient{id=10, fullName='Patient{id=10, fullName=''}'}'}'}'}");
        int int3 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        domain.Patient patient2 = new domain.Patient(0, "hi!");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        java.lang.String str8 = patient2.toString();
        java.lang.String str9 = patient2.getFullName();
        java.lang.String str10 = patient2.toString();
        int int11 = patient2.getId();
        java.lang.Class<?> wildcardClass12 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str3, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str4, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str7, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str8, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str10, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        domain.Patient patient2 = new domain.Patient(35, "Patient{id=1, fullName='Patient{id=32, fullName='hi!'}'}");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=97, fullName=''}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        int int5 = patient2.getId();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=97, fullName=''}" + "'", str6, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=97, fullName=''}" + "'", str7, "Patient{id=97, fullName=''}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str8, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=0, fullName='hi!'}");
        int int3 = patient2.getId();
        int int4 = patient2.getId();
        java.lang.String str5 = patient2.getFullName();
        int int6 = patient2.getId();
        java.lang.String str7 = patient2.toString();
        int int8 = patient2.getId();
        int int9 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='hi!'}" + "'", str5, "Patient{id=0, fullName='hi!'}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str7, "Patient{id=0, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        domain.Patient patient2 = new domain.Patient(97, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        domain.Patient patient2 = new domain.Patient((int) (short) 0, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}");
        java.lang.String str3 = patient2.getFullName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=-1, fullName='Patient{id=10, fullName='hi!'}'}'}");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        domain.Patient patient2 = new domain.Patient(0, "Patient{id=-1, fullName='Patient{id=52, fullName=''}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str4, "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}" + "'", str5, "Patient{id=0, fullName='Patient{id=-1, fullName='Patient{id=52, fullName=''}'}'}");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "Patient{id=0, fullName='hi!'}");
        java.lang.String str3 = patient2.toString();
        java.lang.String str4 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str3, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}" + "'", str4, "Patient{id=100, fullName='Patient{id=0, fullName='hi!'}'}");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        domain.Patient patient2 = new domain.Patient((int) (short) 1, "Patient{id=1, fullName=''}");
        java.lang.Class<?> wildcardClass3 = patient2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        domain.Patient patient2 = new domain.Patient((int) (byte) 100, "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}");
        java.lang.String str3 = patient2.getFullName();
        int int4 = patient2.getId();
        java.lang.Class<?> wildcardClass5 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}" + "'", str3, "Patient{id=10, fullName='Patient{id=52, fullName='Patient{id=35, fullName=''}'}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        domain.Patient patient2 = new domain.Patient((int) (byte) 1, "Patient{id=97, fullName=''}");
        java.lang.String str3 = patient2.toString();
        int int4 = patient2.getId();
        int int5 = patient2.getId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=1, fullName='Patient{id=97, fullName=''}'}" + "'", str3, "Patient{id=1, fullName='Patient{id=97, fullName=''}'}");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        domain.Patient patient2 = new domain.Patient((int) '4', "");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.getFullName();
        java.lang.String str6 = patient2.toString();
        int int7 = patient2.getId();
        java.lang.String str8 = patient2.getFullName();
        int int9 = patient2.getId();
        java.lang.String str10 = patient2.toString();
        int int11 = patient2.getId();
        int int12 = patient2.getId();
        java.lang.String str13 = patient2.toString();
        int int14 = patient2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=52, fullName=''}" + "'", str4, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=52, fullName=''}" + "'", str6, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Patient{id=52, fullName=''}" + "'", str10, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Patient{id=52, fullName=''}" + "'", str13, "Patient{id=52, fullName=''}");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        domain.Patient patient2 = new domain.Patient(52, "Patient{id=100, fullName='Patient{id=52, fullName='Patient{id=97, fullName='Patient{id=10, fullName=''}'}'}'}");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        domain.Patient patient2 = new domain.Patient((int) (byte) -1, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        int int3 = patient2.getId();
        java.lang.String str4 = patient2.getFullName();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str4, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}" + "'", str5, "Patient{id=-1, fullName='Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}" + "'", str6, "Patient{id=1, fullName='Patient{id=0, fullName='Patient{id=-1, fullName=''}'}'}");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        domain.Patient patient2 = new domain.Patient((-1), "Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}");
        java.lang.String str3 = patient2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}'}" + "'", str3, "Patient{id=-1, fullName='Patient{id=0, fullName='Patient{id=0, fullName='Patient{id=10, fullName='Patient{id=10, fullName='hi!'}'}'}'}'}");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        domain.Patient patient2 = new domain.Patient((int) (short) 100, "hi!");
        java.lang.String str3 = patient2.getFullName();
        java.lang.String str4 = patient2.toString();
        java.lang.String str5 = patient2.toString();
        java.lang.String str6 = patient2.getFullName();
        java.lang.String str7 = patient2.getFullName();
        java.lang.String str8 = patient2.getFullName();
        java.lang.Class<?> wildcardClass9 = patient2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str4, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Patient{id=100, fullName='hi!'}" + "'", str5, "Patient{id=100, fullName='hi!'}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

