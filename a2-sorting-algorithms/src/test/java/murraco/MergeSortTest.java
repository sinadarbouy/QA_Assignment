package murraco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class MergeSortTest {

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

}