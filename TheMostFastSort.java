import java.util.Arrays;

public class TheMostFastSort {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 40; //диапазон от -40 до 60
        }
        for (int elem: array) {
            System.out.print(elem + " ");
        }
        Arrays.sort(array); //"под капотом" быстрая сортировка
        // На самом деле в java вообще не нужно знать наизусть алгоритмы сортировок только понимать их :)
        System.out.println();
        for (int elem: array) {
            System.out.print(elem + " ");
        }
    }
}
