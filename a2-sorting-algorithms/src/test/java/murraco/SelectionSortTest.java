package murraco;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import murraco.SelectionSort;


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
        final Integer[] data = {1,2,3,4,5};
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


}
