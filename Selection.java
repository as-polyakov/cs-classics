import java.util.*;

public class Selection extends QuickSortBase {

    public static void main(String[] args) {
        Integer[] array = {3, 8, 2, 5, 1, 4, 7, 6};//readArray();
        int n = 6;//readArray()[0];
        selection(array, n - 1, 0, array.length);
        System.out.println(n + "th order statistic is " + array[n - 1]);
    }
    private static void selection(Integer[] arr, int n, int s, int e) {
        if(s >= e)
            return;
        int pivot = randomPivot(arr, s, e);
        int pivotPos = partition(arr, pivot, s, e);
        print(arr);
        if(pivotPos == n)
            return;
        if(pivotPos > n) {
            selection(arr, n, s, pivotPos);
        } else {
            selection(arr, n - pivotPos, pivotPos + 1, e);
        }
    }
}
