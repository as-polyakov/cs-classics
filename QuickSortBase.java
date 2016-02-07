import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuickSortBase {
    private static Random r = new Random(System.currentTimeMillis());

    protected static int partition(Integer[] arr, int pivot, int s, int e) {
        swap(arr, pivot, s);
        int curPos, lastSmall;
        for (curPos = s + 1, lastSmall = s; curPos < e; curPos++) {
            if (arr[curPos] <= arr[s]) {
                if(lastSmall + 1 < curPos)
                    swap(arr, lastSmall + 1, curPos);
                lastSmall++;
            }// 4 2 3
        }
        swap(arr, s, lastSmall);
        return lastSmall;
    }

    protected static void swap(Integer[] arr, int i, int j) {
        Integer tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    protected static int randomPivot(Integer[] arr, int s, int e) {
        return r.nextInt(e - s) + s;
    }

    protected static void print(Integer[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    protected static Integer[] readArray() {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> buf = new ArrayList();
        while (s.hasNextInt()) {
            buf.add(s.nextInt());
        }
        return buf.toArray(new Integer[0]);
    }
}
