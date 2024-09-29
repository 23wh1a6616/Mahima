import java.util.ArrayList;

public class PrimeFibonacci {
    public static void main(String[] args) {
        int limit = 100000;
        ArrayList<Integer> fibonacciNumbers = generateFibonacciNumbers(limit);

        System.out.println("Prime Fibonacci numbers below " + limit + ":");
        for (int num : fibonacciNumbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to generate Fibonacci numbers below a specified limit
    public static ArrayList<Integer> generateFibonacciNumbers(int limit) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int a = 0, b = 1;

        while (a < limit) {
            fibonacci.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        return fibonacci;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        if (num <= 3) return true; // 2 and 3 are prime numbers

        // Check for factors from 2 to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; // Found a factor, not prime
        }

        return true; // No factors found, it's prime
    }
}