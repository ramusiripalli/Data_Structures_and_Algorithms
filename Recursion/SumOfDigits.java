//Sum of Digits
/*Given a number A, we need to find the sum of its digits using recursion.
Problem Constraints
1 <= A <= 109

Input Format
The first and only argument is an integer A.

Output Format
Return an integer denoting the sum of digits of the number A.
Example Input
Input 1:
 A = 46 output: 10
Input 2:
 A = 11  output : 2
 */
public class SumOfDigits {
    // Recursive method to calculate the sum of digits
    public static int getSumOfDigits(int number) {
        // Base case: if number becomes 0, return 0 to stop the recursion
        if (number == 0) {
            return 0;
        } else {
            // Get the last digit of the number using modulo operator
            int lastDigit = number % 10;

            // Recursive call to get the sum of digits for the remaining number
            int sumOfRemainingDigits = getSumOfDigits(number / 10);

            // Return the sum of the last digit and the sum of remaining digits
            return lastDigit + sumOfRemainingDigits;
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        int sum = getSumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}




//normal approach
public class SumOfDigits {
    public static int getSumOfDigits(int number) {
        int sum = 0;

        // Iterate through each digit of the number
        while (number != 0) {
            // Get the last digit of the number using modulo operator
            int digit = number % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from the number
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 12345;
        int sum = getSumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}

