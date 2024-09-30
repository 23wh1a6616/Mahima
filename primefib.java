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

    public static boolean isPrime(int num) {
        if (num <= 1) return false; 
        if (num <= 3) return true; 

 
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; 
        }

        return true;
    }
}
