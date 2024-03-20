import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        double[] array = {3.5, -2.1, 7.8, -4.2, 6.0, -1.5, 9.2};

        double maxElement = findMaxElement(array);
        System.out.println("Maximum element of the array: " + maxElement);

        double sumBeforeLastPositive = sumBeforeLastPositiveElement(array);
        System.out.println("Sum of elements before the last positive element: " + sumBeforeLastPositive);

        compressArray(array, -3.0, 4.0);
        System.out.println("Array after compression: " + Arrays.toString(array));
    }

    public static double findMaxElement(double[] array) {
        double max = Double.NEGATIVE_INFINITY;
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double sumBeforeLastPositiveElement(double[] array) {
        double sum = 0;
        int lastIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                lastIndex = i;
            }
        }
        if (lastIndex != -1) {
            for (int i = 0; i < lastIndex; i++) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void compressArray(double[] array, double a, double b) {
        int newIndex = 0;
        for (double num : array) {
            if (Math.abs(num) < Math.abs(a) || Math.abs(num) > Math.abs(b)) {
                array[newIndex++] = num;
            }
        }
        Arrays.fill(array, newIndex, array.length, 0.0);
    }
}