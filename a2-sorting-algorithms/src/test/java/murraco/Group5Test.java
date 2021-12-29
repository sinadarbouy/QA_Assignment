package murraco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class Group5Test {
    @Test
    public void testSelectionSort() {
        final Integer[] data = { 4, 3, 0, 11, 7, 5, 15, 12, 99, 1 };
        SelectionSort.selectionSort(data);
        assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_Duplicate() {
        final Integer[] data = { 4, 3, 3, 0, 11, 7, 5, 15, 12, 99, 1, };
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
        final Double[] data = { -5.1, 4.2, 3.3, 3.3, 0.5, 11.6, 7.7, 5.8, 15.9, 12.0, 99.0, 1.2, -8, -11 };
        SelectionSort.selectionSort(data);
        assertEquals("[-11, -8, -5.1, 0.5, 1.2, 3.3, 3.3, 4.2, 5.8, 7.7, 11.6, 12.0, 15.9, 99.0]",
                Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_MaxAtLast() {
        final Integer[] data = { 1, 3, 2, 4, 5 };
        SelectionSort.selectionSort(data);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_MinAtFirs() {
        final Integer[] data = { 1, 3, 2, 4, 5 };
        SelectionSort.selectionSort(data);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_MaxAtEnd() {
        final Integer[] data = { 2, 3, 4, 1, 5 };
        SelectionSort.selectionSort(data);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
    }

    @Test
    public void testSelectionSort_MaxAtString() {
        final Character[] data = { 'a', 'c', 'b' };
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
        boolean res = Arrays.asList(before_Sort).containsAll(Arrays.asList(in_array));
        assertEquals(true, res);
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
        boolean answer = Arrays.stream(methods)
                .anyMatch(n -> n.getName() == "insertionSort" && n.getReturnType().getName() == "void");
        assertEquals(true, answer);
    }

    @Test
    public void test_Null_InsertionSort() {
        InsertionSort.insertionSort(null);
        assertNull("The array is empty.", null);
    }

    @Test
    public void testHeapsortNegativeInOrder() {
        final Integer[] data = {-9, -5, -2, -1};
        Heapsort.heapSort(data);
        assertEquals("[-9, -5, -2, -1]", Arrays.toString(data));
    }

    @Test
    public void testHeapSortOrderedStrings() {
        final String[] data = {"aa", "bb", "cc", "dd"};
        Heapsort.heapSort(data);
        assertEquals("[aa, bb, cc, dd]", Arrays.toString(data));
    }

    @Test
    public void testHeapSortDifferentStrings() {
        final String[] data = {"k", "mm", "lll", "nnnnn"};
        Heapsort.heapSort(data);
        assertEquals("[k, lll, mm, nnnnn]", Arrays.toString(data));
    }

    @Test
    public void testHeapSortEmptyArray() {
        final String[] data = {};
        Heapsort.heapSort(data);
        assertEquals("[]", Arrays.toString(data));
    }

    @Test
    public void testHeapSortString() {
        final String[] data = {"ab", "ac", "aa", "ba", "bd"};
        Heapsort.heapSort(data);
        assertEquals("[aa, ab, ac, ba, bd]", Arrays.toString(data));
    }

    @Test
    public void testHeapSortSingleInteger() {
        final Integer[] data = {0};
        Heapsort.heapSort(data);
        assertEquals("[0]", Arrays.toString(data));
    }

    // killed mutant line 17
    @Test
    public void testHeapSortTargetMaxHeapify() {
        final Integer[] data = {1, -2, 3};
        Heapsort.maxHeapify(data, 0, data.length - 1);
        assertNotEquals("[1, -2, 3]", Arrays.toString(data));
    }

    @Test
    public void testHeapSortSameIntegers() {
        final Integer[] data = {1, 1, 1, 2, 1};
        Heapsort.heapSort(data);
        assertEquals("[1, 1, 1, 1, 2]", Arrays.toString(data));
    }

    @Test
    public void testQuickSelectionCrossCheck() {
        Integer[] data = {5, -2, 1, 3, -5, 7};
        Quicksort.quickSort(data);
        Integer[] firstSort = data;
        SelectionSort.selectionSort(data);
        Integer[] secondSort = data;
        assertEquals(Arrays.toString(firstSort),  Arrays.toString(secondSort));
    }

    @Test
    public void test_ByteArray_InsertionSort() {
        final Byte[] data = {10,2,7,35};
        SelectionSort.selectionSort(data);
        String c = Arrays.toString(data);
        assertEquals("[2, 7, 10, 35]", Arrays.toString(data));
    }

    @Test
    public void testMergeSort() {
        final Integer[] data = { 4, 3, 0, 11, 7, 5, 15, 12, 99, 1  };
        MergeSort.mergeSort(data);
        assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
    }

    @Test
    public void testMergeSortOneNumber() {
        final Integer[] data = {4};
        MergeSort.mergeSort(data);
        assertEquals("[4]", Arrays.toString(data));
    }

    @Test
    public void testMergeSortPositiveAndNegativeNumbers() {
        final Integer[] data = { 4, -3, 0, -11, -7, 5, 15, 12, -99, 1 };
        MergeSort.mergeSort(data);
        assertEquals("[-99, -11, -7, -3, 0, 1, 4, 5, 12, 15]", Arrays.toString(data));
    }

    @Test
    public void testMergeSortOrdered() {
        final Integer[] data = { 1, 2, 3, 5, 7, 9, 10, 15, 20, 100 };
        MergeSort.mergeSort(data);
        assertEquals("[1, 2, 3, 5, 7, 9, 10, 15, 20, 100]", Arrays.toString(data));
    }

    @Test
    public void testMergeSortOrdered2() {
        final Integer[] data = { 100, 20, 15, 10, 9, 7, 5, 3, 2, 1};
        MergeSort.mergeSort(data);
        assertEquals("[1, 2, 3, 5, 7, 9, 10, 15, 20, 100]", Arrays.toString(data));
    }

    @Test
    public void testMergeSortEmpty() {
        final Integer[] data = {};
        MergeSort.mergeSort(data);
        assertEquals("[]", Arrays.toString(data));
    }


    // causes error, not handled by the algorithm - E in BICEPS (error)
/**    @Test
public void testHeapSortNull() {
final Integer[] data = null;
Heapsort.heapSort(data);
assertNull(data);
} */
}
