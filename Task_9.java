import java.util.Random;

public class Task_9 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] matrix = generateMatrix(rows, cols);

        System.out.println("Matrix:");
        printMatrix(matrix);

        int sumOfNegatives = sumOfNegatives(matrix);
        System.out.println("\nSum of negative elements: " + sumOfNegatives);
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(201) - 100;
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

    public static int sumOfNegatives(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num < 0) {
                    sum += num;
                }
            }
        }
        return sum;
    }
}