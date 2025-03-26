import java.util.Scanner;


public class Main {

    /**
     * Finds the minimum element in an array recursively.
     *
     * @param nums   The array of integers.
     * @param length The current length of the array being processed.
     * @return The minimum element in the array.
     *
     * Time Complexity: O(n) - Each element is checked once.
     */
    public static int minElementInArray(int[] nums, int length) {
        if (length == 1) return nums[0];
        return Math.min(nums[length - 1], minElementInArray(nums, length - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Min element in array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        long startTime = System.nanoTime();
        int minResult = minElementInArray(arr, size);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // nanoseconds to milliseconds
        System.out.println("Minimum element of the array: " + minResult);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}


