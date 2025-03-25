import java.util.Scanner;


public class Main {

    public static int minElementInArray(int[] nums, int length){

        if(length == 1) return nums[0];

        return Math.min(nums[length - 1], minElementInArray(nums, length - 1));

    }

    public static float avarageInArray(int[] nums, int length){

        if(length == 1) return nums[0];

        return nums[length-1] + avarageInArray(nums, length - 1);

    }

    public static boolean isPrime(int num){

        if(num % 2 == 0) return true;
        return false;

    }

    public static int fact(int num){

        if (num == 1) return 1;
        return num * fact(num - 1);

    }

    public static int fibonacci(int num){
        if(num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);

    }

    public static int powerOf(int num, int power){
        if (power == 0) return 1;
        return num * powerOf(num, power - 1);

    }

    public static void reverseArray(int length, Scanner scanner) {
        if (length == 1) {
            System.out.print(scanner.nextInt() + " ");
            return;
        }
        int num = scanner.nextInt();
        reverseArray(length - 1, scanner);
        System.out.print(num + " ");
    }

    public static boolean isAllDigit(char[] str, int index) {
        if (index == str.length) return true;
        if (!Character.isDigit(str[index])) return false;
        return isAllDigit(str, index + 1);
    }

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(gcd(n, k));
    }
}


