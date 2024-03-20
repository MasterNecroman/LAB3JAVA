import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        double[] array = {1.5, -0.2, 0.8, -1.2, -0.5, 0.9, 1.1};

        double negativeProduct = calculateNegativeProduct(array);
        System.out.println("Product of negative elements of the array: " + negativeProduct);

        double sumBeforeMax = sumBeforeMaxElement(array);
        System.out.println("Sum of positive elements before the maximum element: " + sumBeforeMax);

        reverseArray(array);
        System.out.println("Array after reversal: " + Arrays.toString(array));
    }

    public static double calculateNegativeProduct(double[] array) {
        double product = 1.0;
        for (double num : array) {
            if (num < 0) {
                product *= num;
            }
        }
        return product;
    }

    public static double sumBeforeMaxElement(double[] array) {
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0.0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (i < maxIndex && array[i] > 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void reverseArray(double[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            double temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}