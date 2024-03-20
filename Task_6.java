import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 0, -4, 5, 6, -7};

        int positiveCount = countPositiveElements(array);
        System.out.println("Number of positive elements in the array: " + positiveCount);

        int sumAfterZero = sumAfterLastZero(array);
        System.out.println("Sum of elements after the last zero element: " + sumAfterZero);

        rearrangeArray(array);
        System.out.println("Array after rearrangement: " + Arrays.toString(array));
    }

    public static int countPositiveElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumAfterLastZero(int[] array) {
        int sum = 0;
        boolean foundZero = false;
        for (int i = array.length - 1; i >= 0; i--) {
            if (foundZero) {
                sum += array[i];
            } else if (array[i] == 0) {
                foundZero = true;
            }
        }
        return sum;
    }

    public static void rearrangeArray(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) <= 1) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
    }
}
