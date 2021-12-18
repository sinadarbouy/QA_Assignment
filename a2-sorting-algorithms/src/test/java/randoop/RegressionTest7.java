package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
            murraco.SelectionSort.swap(strArray3, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
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
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass32 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        java.lang.Class<?> wildcardClass12 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
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
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass23 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
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
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
            murraco.SelectionSort.swap(strArray6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
            murraco.SelectionSort.swap(strArray4, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
            murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
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
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        murraco.SelectionSort.swap(strArray4, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
            murraco.SelectionSort.swap(strArray3, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
            murraco.SelectionSort.swap(strArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
            murraco.SelectionSort.swap(strArray1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        java.lang.Class<?> wildcardClass13 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        murraco.SelectionSort.swap(strArray4, 0, 1);
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
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
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
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
            murraco.SelectionSort.swap(strArray6, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass30 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
            murraco.SelectionSort.swap(strArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass29 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        murraco.SelectionSort.swap(strArray2, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass28 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
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
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 1);
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
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, 0);
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
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
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
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
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
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass26 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
            murraco.SelectionSort.swap(strArray6, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
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
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass31 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
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
            murraco.SelectionSort.swap(strArray6, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.swap(strArray1, 0, (int) (short) 0);
        murraco.SelectionSort.swap(strArray1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
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
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
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
        java.lang.Class<?> wildcardClass32 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
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
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray5, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
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
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        java.lang.Class<?> wildcardClass20 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
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
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
            murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
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
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 0);
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
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
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
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass34 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        java.lang.Class<?> wildcardClass23 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
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
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        java.lang.Class<?> wildcardClass23 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
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
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        java.lang.Class<?> wildcardClass22 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass38 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass28 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 0);
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
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
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
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        java.lang.Class<?> wildcardClass24 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass30 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        murraco.SelectionSort.selectionSort(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray1, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        java.lang.Class<?> wildcardClass35 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        java.lang.Class<?> wildcardClass23 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        murraco.SelectionSort.selectionSort(strArray5);
        java.lang.Class<?> wildcardClass21 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
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
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass34 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
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
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (short) 0);
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
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
            murraco.SelectionSort.swap(strArray3, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
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
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.swap(strArray6, 0, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 1);
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
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass34 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        murraco.SelectionSort.swap(strArray3, (int) (short) 0, 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, 0);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (byte) 1);
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
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass25 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass32 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        java.lang.Class<?> wildcardClass26 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
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
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        murraco.SelectionSort.selectionSort(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "hi!", "hi!", "" };
        murraco.SelectionSort.swap(strArray6, 1, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        java.lang.Class<?> wildcardClass28 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
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
        java.lang.Class<?> wildcardClass25 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
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
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        murraco.SelectionSort.swap(strArray4, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, 0);
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
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
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
        murraco.SelectionSort.swap(strArray4, 1, 0);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, (int) (byte) 0, (int) (short) 1);
        murraco.SelectionSort.swap(strArray5, (int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 0, 0);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
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
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
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
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, 1);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, 0, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray5);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
            murraco.SelectionSort.swap(strArray4, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (byte) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 1, (int) (short) 1);
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
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
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
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray3, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
            murraco.SelectionSort.swap(strArray6, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 1);
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
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.swap(strArray4, (int) (byte) 1, 0);
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) (byte) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        murraco.SelectionSort.selectionSort(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass24 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        java.lang.Class<?> wildcardClass25 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (short) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        java.lang.Class<?> wildcardClass31 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!", "hi!", "hi!", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        murraco.SelectionSort.swap(strArray6, 0, (int) (short) 0);
        murraco.SelectionSort.selectionSort(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
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
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        murraco.SelectionSort.swap(strArray6, 1, 1);
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
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.selectionSort(strArray6);
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
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
            murraco.SelectionSort.swap(strArray6, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray6);
        murraco.SelectionSort.swap(strArray6, (int) (byte) 1, (int) (short) 0);
        murraco.SelectionSort.swap(strArray6, 0, (int) (byte) 1);
        murraco.SelectionSort.swap(strArray6, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "", "" };
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, 1, 0);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.swap(strArray3, (int) (byte) 1, (int) (short) 1);
        murraco.SelectionSort.selectionSort(strArray3);
        murraco.SelectionSort.selectionSort(strArray3);
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        murraco.SelectionSort.selectionSort(strArray4);
        murraco.SelectionSort.selectionSort(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray4, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
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
            murraco.SelectionSort.swap(strArray4, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "", "", "hi!" };
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.selectionSort(strArray5);
        murraco.SelectionSort.swap(strArray5, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray5, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        murraco.SelectionSort.selectionSort(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
            murraco.SelectionSort.swap(strArray6, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        // The following exception was thrown during execution in test generation
        try {
            murraco.SelectionSort.swap(strArray6, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }
}

