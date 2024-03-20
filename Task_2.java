public class Task_2 {
    public static void main(String[] args) {
        int m = 15;
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i] = i % 3;
        }

        reorderArray(array);

        System.out.println("Array after reordering:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void reorderArray(int[] array) {
        int[] count = new int[3];
        for (int num : array) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }
}