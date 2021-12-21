package murraco;

import static org.junit.Assert.assertEquals;

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
        final Integer[] data = { 4, 3 };
        MergeSort.mergeSort(data);
        assertEquals("[3, 4]", Arrays.toString(data));
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

}
