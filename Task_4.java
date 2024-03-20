import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        double[] array = {1.5, -0.2, 0.8, -1.2, -0.5, 0.9, 1.1};

        int minIndex = findMinIndex(array);
        System.out.println("Index of the minimum element of the array: " + minIndex);

        double sumBetweenNegatives = sumBetweenNegatives(array);
        System.out.println("Sum of elements between the first and second negative elements: " + sumBetweenNegatives);

        rearrangeArray(array);
        System.out.println("Array after rearrangement: " + Arrays.toString(array));
    }

    public static int findMinIndex(double[] array) {
        double min = Double.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static double sumBetweenNegatives(double[] array) {
        boolean foundFirstNegative = false;
        double sum = 0;
        for (double num : array) {
            if (num < 0) {
                if (foundFirstNegative) {
                    break;
                }
                foundFirstNegative = true;
            } else if (foundFirstNegative) {
                sum += num;
            }
        }
        return sum;
    }

    public static void rearrangeArray(double[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) <= 1) {
                double temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
    }
}