public class DirectSort {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 40; //диапазон от -40 до 60
        }
        for (int elem: array) {
            System.out.print(elem + " ");
        }
        for (int i = 0; i < array.length; i++) {
            int iMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[iMin] > array[j]) {
                    iMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[iMin];
            array[iMin] = temp;
        }
        System.out.println();
        for (int elem: array) {
            System.out.print(elem + " ");
        }
    }
}
