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

    /**
     * Calculates the sum of all elements in an array recursively.
     *
     * @param nums   The array of integers.
     * @param length The current length of the array being processed.
     * @return The sum of the array elements.
     *
     * Time Complexity: O(n) - Each element is added once.
     */
    public static float sumInArray(int[] nums, int length) {
        if (length == 1) return nums[0];
        return nums[length - 1] + sumInArray(nums, length - 1);
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
        long startTime = System.currentTimeMillis();
        int minResult = minElementInArray(arr, size);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Minimum element of the array: " + minResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Sum of elements in array
        int[] arr2 = new int[size];
        System.out.println("Enter the size of the array: ");
        int size2 = sc.nextInt();
        System.out.println("Enter the array elements again: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        startTime = System.currentTimeMillis();
        float sumResult = sumInArray(arr2, size2);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("The sum of the array elements: " + sumResult);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}


