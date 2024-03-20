import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest element: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }
}