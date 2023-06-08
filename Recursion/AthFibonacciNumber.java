//using recursive approach


public class Fibonacci {
    // Recursive function to find the Ath Fibonacci number
    public static int fibonacci(int A) {
        // Base cases: F0 = 0 and F1 = 1
        if (A <= 1) {
            return A;
        }
        
        // Recursive step: Fn = Fn-1 + Fn-2
        return fibonacci(A - 1) + fibonacci(A - 2);
    }

    public static void main(String[] args) {
        int A = 10; // Change this value to test different Fibonacci numbers

        // Call the fibonacci function to find the Ath Fibonacci number
        int result = fibonacci(A);

        // Print the result
        System.out.println("The " + A + "th Fibonacci number is: " + result);
    }
}





//Another approach using Iteration

public class Fibonacci {
    public static int fibonacci(int A) {
        if (A <= 1) {
            return A;
        }
        
        int prev1 = 0; // Initialize the first Fibonacci number (F0)
        int prev2 = 1; // Initialize the second Fibonacci number (F1)
        int current = 0; // Variable to store the current Fibonacci number
        
        // Calculate the Fibonacci numbers iteratively
        for (int i = 2; i <= A; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        
        return current;
    }

    public static void main(String[] args) {
        int A = 10; // Change this value to test different Fibonacci numbers

        // Call the fibonacci function to find the Ath Fibonacci number
        int result = fibonacci(A);

        // Print the result
        System.out.println("The " + A + "th Fibonacci number is: " + result);
    }
}
