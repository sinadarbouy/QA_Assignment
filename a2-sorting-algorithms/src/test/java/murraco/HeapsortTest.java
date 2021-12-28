package murraco;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

import static org.junit.Assert.*;

public class HeapsortTest {

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

    // causes error, not handled by the algorithm - E in BICEPS (error)
    @Test
    public void testHeapSortNull() {
        final Integer[] data = null;
        Heapsort.heapSort(data);
        assertNull(data);
    }

}
