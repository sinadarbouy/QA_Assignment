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

public class Group5Test {
    @Test
    public void testBubbleSort() {
        final Integer[] data = { 4, 3, 0, 11, 7, 5, 15, 12, 99, 1 };
        BubbleSort.bubbleSort(data);
        assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
    }
}
