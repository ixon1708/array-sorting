import java.util.Arrays;

public class QuickSort {
    //собственно ученикам и не нужно реализовывать эту сортировку, нужно просто знать о её существовании

    static int[] arr = new int[20]; // что это такое рассказано в следующей теме

    public static void quicksort(int start, int end) { // и это тоже в следующей теме
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        boolean isForward = true;
        while (i != j) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                isForward = !isForward;
            }
            if (isForward) {
                i++;
            } else {
                j--;
            }
        }
        quicksort(start, i -1);
        quicksort(i + 1, end);
    }

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        quicksort(0, arr.length - 1);
        System.out.println();
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
