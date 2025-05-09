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

    /**
     * This method computes the nth Fibonacci number recursively.
     * Time complexity: O(2^n), exponential time due to repeated calculations.
     * @param num The position of the Fibonacci number.
     * @return The Fibonacci number at the given position.
     */
    public static int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    /**
     * This method computes the power of a number using recursion.
     * Time complexity: O(n), where n is the exponent.
     * The function calls itself power times, resulting in linear complexity.
     * @param num The base number.
     * @param power The exponent.
     * @return The result of raising num to the given power.
     */
    public static int powerOf(int num, int power) {
        if (power == 0) return 1;
        return num * powerOf(num, power - 1);
    }

    /**
     * This method reads and prints an array in reverse order recursively.
     * Time complexity: O(n), where n is the number of elements in the array.
     * Each element is processed once, leading to linear complexity.
     * @param length The number of elements in the array.
     * @param scanner Scanner to read input values.
     */
    public static void reverseArray(int length, Scanner scanner) {
        if (length == 1) {
            System.out.print(scanner.nextInt() + " ");
            return;
        }
        int num = scanner.nextInt();
        reverseArray(length - 1, scanner);
        System.out.print(num + " ");
    }

    /**
     * This method checks if a given character array represents a number.
     * Time complexity: O(n), where n is the length of the character array.
     * Each character is checked once, leading to linear complexity.
     * @param str The character array.
     * @param index The current index in the recursion.
     * @return True if all characters are digits, false otherwise.
     */
    public static boolean isAllDigit(char[] str, int index) {
        if (index == str.length) return true;
        if (!Character.isDigit(str[index])) return false;
        return isAllDigit(str, index + 1);
    }

    /**
     * This method computes the binomial coefficient recursively.
     * Time complexity: O(2^n), exponential due to overlapping subproblems.
     * @param m The number of elements.
     * @param k The chosen subset size.
     * @return The binomial coefficient C(m, k).
     */
    public static int binomialCoefficient(int m, int k) {
        if (k == 0 || k == m) return 1;
        return binomialCoefficient(m - 1, k - 1) + binomialCoefficient(m - 1, k);
    }

    /**
     * This method computes the Greatest Common Divisor (GCD) using the Euclidean algorithm.
     * Time complexity: O(log n), as each step reduces the problem size significantly.
     * @param a First number.
     * @param b Second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
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

        long startTime = System.nanoTime();
        int minResult = minElementInArray(arr, size);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Minimum element of the array: " + minResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Sum of elements in array
        System.out.print("Enter the size of the array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter the array elements for sum: ");

        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        startTime = System.nanoTime();
        float sumResult = avarageInArray(arr2, size2);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("The sum of the array elements: " + sumResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Checks whether a number is prime or not
        System.out.print("Enter a number to check for simplicity: ");
        int primeNum = sc.nextInt();

        startTime = System.nanoTime();
        System.out.println("Number " + primeNum + (isPrime(primeNum) ? " is Prime" : " is Composite"));
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Time taken: " + duration + " milliseconds");

        // Factorial Calculation
        System.out.print("Enter a number to calculate the factorial: ");
        int factNum = sc.nextInt();

        startTime = System.nanoTime();
        int factResult = fact(factNum);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Factorial " + factNum + " equals " + factResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Fibonacci Calculation
        System.out.print("Enter a number to calculate the fibonacci: ");
        int fibNum = sc.nextInt();

        startTime = System.nanoTime();
        int fibResult = fibonacci(fibNum);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Fibonacci " + fibNum + " equals " + fibResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Exponentiation of a number
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        startTime = System.nanoTime();
        int powerResult = powerOf(base, exponent);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println(base + " raised to the power of " + exponent + " equals " + powerResult);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Reading the array and outputting it in reverse order
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");

        startTime = System.nanoTime();
        reverseArray(n, sc);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("\nTime taken: " + duration + " milliseconds");

        // Checking if a string consists of only numbers
        System.out.print("Enter a string to check if it contains only digits: ");
        String inputStr = sc.next();
        char[] charArray = inputStr.toCharArray();

        startTime = System.nanoTime();
        boolean isDigitOnly = isAllDigit(charArray, 0);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("The string \"" + inputStr + "\" contains only digits: " + isDigitOnly);
        System.out.println("Time taken: " + duration + " milliseconds");

        // Calculation of the binomial coefficient
        System.out.print("Enter m for binomial coefficient C(m, k): ");
        int m = sc.nextInt();
        System.out.print("Enter k for binomial coefficient C(m, k): ");
        int k = sc.nextInt();

        startTime = System.nanoTime();
        int binomialResult = binomialCoefficient(m, k);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("Binomial coefficient C(" + m + ", " + k + ") = " + binomialResult);
        System.out.println("Time taken: " + duration + " milliseconds\n");

        // Calculating the GCD
        System.out.print("Enter first number for GCD: ");
        int a = sc.nextInt();
        System.out.print("Enter second number for GCD: ");
        int b = sc.nextInt();

        startTime = System.nanoTime();
        int gcdResult = gcd(a, b);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;

        System.out.println("GCD of " + a + " and " + b + " = " + gcdResult);
        System.out.println("Time taken: " + duration + " milliseconds\n");
    }
}


