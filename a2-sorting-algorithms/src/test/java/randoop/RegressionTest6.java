package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass22 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass20 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        java.lang.Class<?> wildcardClass20 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass26 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        java.lang.Class<?> wildcardClass26 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass31 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass19 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass14 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        java.lang.Class<?> wildcardClass27 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass31 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass30 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass24 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass32 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass22 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass16 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray2, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass29 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass18 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass25 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass16 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        java.lang.Class<?> wildcardClass25 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass16 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        java.lang.Class<?> wildcardClass33 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass29 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        java.lang.Class<?> wildcardClass16 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass20 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass32 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass28 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass33 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass23 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass30 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass19 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass14 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass19 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass17 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass32 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass34 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass26 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass19 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass33 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass26 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass20 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass30 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass29 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass22 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass22 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass29 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        java.lang.Class<?> wildcardClass10 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass29 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass17 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass33 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass27 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass24 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass31 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}

