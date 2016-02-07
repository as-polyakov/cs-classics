import java.util.*;

public class QuickSort extends QuickSortBase {

    public static void main(String[] args) {
        Integer[] array = readArray();
        print(array);
        quickSort(array, 0, array.length);
        print(array);
    }

    private static void quickSort(Integer[] arr, int s, int e) {
        if (s >= e)
            return;

        int pivot = randomPivot(arr, s, e);
        System.out.println("pivot: " + pivot);
        int pivotPos = partition(arr, pivot, s, e);
        quickSort(arr, s, pivotPos);
        quickSort(arr, pivotPos + 1, e);
    }
}


