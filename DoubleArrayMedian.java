import java.util.*;

public class DoubleArrayMedian {
    public static void main(String[] args) {
        Integer[] arr1 = readArray();
        Integer[] arr2 = readArray();
        int m = median(0, arr1.length - 1, arr1, arr2);
        if( m < 0) {
            m =  median(0, arr2.length - 1, arr2, arr1);
            if(m < 0)
                throw new IllegalStateException("median not found");
        }
        System.out.println(m);

    }
    
    private static int median(int s, int e, Integer[] arr1,
            Integer[] arr2) {
        System.out.println("s: " + s + " e: " + e);
        if (e - s < 0)
            return -1;
        int m = (s + e) / 2;
        int a1 = arr1[m];
        int m2 = Arrays.binarySearch(arr2, 0, arr2.length, a1);
        if(m2 < 0)
            m2 = -m2 - 1;
        if(m + m2 == (arr1.length + arr2.length - 2) / 2)
            return a1;
        if(m + m2 > (arr1.length + arr2.length - 2) / 2)
            return median(s, m - 1, arr1, arr2);
        else
            return median(m + 1, e, arr1, arr2);
    }

    private static void print(Integer[] a) {
        for(Integer v: a) {
            System.out.println(v);
        }
    }

    private static Integer[] readArray() {
        List<Integer> buf = new ArrayList();
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()) {
            buf.add(s.nextInt());
        }
        Integer[] arr1 = buf.toArray(new Integer[0]);
        return arr1;
    }
}
