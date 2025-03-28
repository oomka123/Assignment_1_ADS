import java.util.Scanner;


public class Main {

    /**
     * This method finds the minimum element in an array recursively.
     * It compares each element with the minimum found so far.
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm processes each element once, leading to linear time complexity.
     * @param nums The array of integers.
     * @param length The length of the array.
     * @return The minimum element in the array.
     */
    public static int minElementInArray(int[] nums, int length) {
        if (length == 1) return nums[0];
        return Math.min(nums[length - 1], minElementInArray(nums, length - 1));
    }

    /**
     * This method calculates the sum of array elements recursively.
     * The sum is computed by adding each element to the sum of the rest.
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm visits each element once, leading to linear complexity.
     * @param nums The array of integers.
     * @param length The length of the array.
     * @return The sum of all elements in the array.
     */
    public static float avarageInArray(int[] nums, int length) {
        if (length == 1) return nums[0];
        return nums[length - 1] + avarageInArray(nums, length - 1);
    }

    /**
     * Determines if a given number is prime.
     * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     * The method checks divisibility starting from 2 up to sqrt(n).
     * Time Complexity: O(sqrt(n)) - We only check divisibility up to the square root of n,
     * @param num The number to check.
     * @return True if the number is prime, otherwise false.
     */
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    /**
     * This method calculates the factorial of a given number using recursion.
     * Time complexity: O(n), where n is the input number.
     * The recursive function calls itself n times, leading to linear complexity.
     * @param num The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int fact(int num) {
        if (num == 1) return 1;
        return num * fact(num - 1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Min element in array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements: ");

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
        System.out.print("Enter the size of the array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size];
        System.out.print("Enter the array elements for sum: ");

        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        startTime = System.currentTimeMillis();
        float sumResult = avarageInArray(arr2, size2);
        endTime = System.currentTimeMillis();
        duration = (endTime - startTime);
        System.out.println("The sum of the array elements: " + sumResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Checks whether a number is prime or not
        System.out.print("Enter a number to check for simplicity: ");
        int primeNum = sc.nextInt();
        startTime = System.currentTimeMillis();
        System.out.println("Number " + primeNum + (isPrime(primeNum) ? " is Prime" : " is Composite"));
        endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");

        // Factorial Calculation
        System.out.print("Enter a number to calculate the factorial: ");
        int factNum = sc.nextInt();
        startTime = System.currentTimeMillis();
        int factResult = fact(factNum);
        endTime = System.currentTimeMillis();
        System.out.println("Factorial " + factNum + " equals " + factResult);
        System.out.println("Time taken: " + (endTime - startTime) + " milliseconds");
    }
}


