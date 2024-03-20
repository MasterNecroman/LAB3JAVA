import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] matrix = generateMatrix(rows, cols);
        int z = 50;

        countExceedsZ(matrix, z);
    }

    public static int[][] generateMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(101); // Генерация случайных чисел от 0 до 100
            }
        }
        return matrix;
    }

    public static void countExceedsZ(int[][] matrix, int z) {
        int cols = matrix[0].length;
        int[] counts = new int[cols];

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > z) {
                    counts[j]++;
                }
            }
            System.out.println("Column " + (j + 1) + ": " + counts[j]);
        }
    }
}