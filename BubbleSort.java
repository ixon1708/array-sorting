public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 40; //диапазон от -40 до 60
        }
        for (int elem: array) {
            System.out.print(elem + " ");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j +1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int elem: array) {
            System.out.print(elem + " ");
        }
    }
}
