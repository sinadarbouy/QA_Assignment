package murraco;

import org.junit.Test;

import java.io.Serializable;
import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import net.jqwik.api.*;


public class SelectionSortTest {
    @Test
    public void testSelectionSort() {
        final Integer[] data = { 4, 3, 0, 11, 7, 5, 15, 12, 99, 1 };
        SelectionSort.selectionSort(data);
        assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_Duplicate() {
        final Integer[] data = { 4, 3, 3, 0, 11, 7, 5, 15, 12, 99, 1 };
        SelectionSort.selectionSort(data);
        assertEquals("[0, 1, 3, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_Duplicate_Negative() {
        final Integer[] data = { -5, 4, 3, 3, 0, 11, 7, 5, 15, 12, 99, 1 };
        SelectionSort.selectionSort(data);
        assertEquals("[-5, 0, 1, 3, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_Duplicate_Negative_Double() {
        final Double[] data = { -5.1, 4.2, 3.3, 3.3, 0.5, 11.6, 7.7, 5.8, 15.9, 12.0, 99.0, 1.2 };
        SelectionSort.selectionSort(data);
        assertEquals("[-5.1, 0.5, 1.2, 3.3, 3.3, 4.2, 5.8, 7.7, 11.6, 12.0, 15.9, 99.0]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_MaxAtLast() {
        final Integer[] data = {1,3,2,4,5};
        SelectionSort.selectionSort(data);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_MaxAtFirst() {
        final Integer[] data = {5,2,3,4,1};
        SelectionSort.selectionSort(data);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_MaxAtString() {
        final Character[] data = {'a','c','b'};
        SelectionSort.selectionSort(data);
        assertEquals("[a, b, c]", Arrays.toString(data));
    }

    @Property
    <T extends Comparable> void Test_PBT_Invariants_CheckSize_Sort(@ForAll T[] in_array) {
        int in_size = in_array.length;
        SelectionSort.selectionSort(in_array);
        assertEquals(in_size, in_array.length);
    }
    @Property
    <T extends Comparable> void Test_PBT_Invariants_CheckContents_Sort(@ForAll T[] in_array) {
        T[] before_Sort = in_array;
        SelectionSort.selectionSort(in_array);
        boolean res= Arrays.asList(before_Sort).containsAll(Arrays.asList(in_array));
        assertEquals(true,res);
    }

    @Property
    <T extends Comparable> void Test_PBT_Idempotence_Sort(@ForAll T[] in_array) {
        SelectionSort.selectionSort(in_array);
        T[] first_Sort = in_array;
        SelectionSort.selectionSort(in_array);
        T[] second_Sort = in_array;
        assertEquals(first_Sort, second_Sort);
    }
    
  @Test
  public void test_Type_InsertionSort() throws NoSuchMethodException {
    Method[] methods = InsertionSort.class.getMethods();
    String d = methods[0].getReturnType().getName();
    boolean answer = Arrays.stream(methods).anyMatch(n -> n.getName() == "insertionSort" && n.getReturnType().getName() == "void");
    assertEquals(true, answer);
  }

  @Test
  public void test_Null_InsertionSort() {
    InsertionSort.insertionSort(null);
    assertNull("The array is empty.", null);
  }



}
