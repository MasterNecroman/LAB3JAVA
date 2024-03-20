import java.util.Random;

public class Task_10 {
    public static void main(String[] args) {
        int n = 5;
        int size = 5;

        System.out.println("Matrices:");
        int maxSum = findMaxSumBelowMainDiagonal(n, size);

        System.out.println("\nMaximum sum below main diagonal across " + n + " matrices: " + maxSum);
    }

    public static int findMaxSumBelowMainDiagonal(int n, int size) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int[][] matrix = generateMatrix(size);
            System.out.println("\nMatrix " + (i + 1) + ":");
            printMatrix(matrix);
            int sum = sumBelowMainDiagonal(matrix);
            System.out.println("Sum below main diagonal: " + sum);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static int[][] generateMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(101);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int sumBelowMainDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}