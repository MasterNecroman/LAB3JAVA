import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int size = 200;
        int[] array = generateArray(size);

        System.out.println("Generated array:");
        printArray(array);

        int[] maxSubarray = findMaxSubarray(array, 10);

        System.out.println("\nMaximum sum subarray of length 10:");
        printArray(maxSubarray);
    }

    public static int[] generateArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        return array;
    }

    public static int[] findMaxSubarray(int[] array, int subarraySize) {
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        for (int i = 0; i <= array.length - subarraySize; i++) {
            int currentSum = 0;
            for (int j = i; j < i + subarraySize; j++) {
                currentSum += array[j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = i;
            }
        }

        int[] maxSubarray = new int[subarraySize];
        System.arraycopy(array, startIndex, maxSubarray, 0, subarraySize);
        return maxSubarray;
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}