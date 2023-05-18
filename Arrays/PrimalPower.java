/*
Q3. Primal Power
"Primal Power" of an array is defined as the count of prime numbers present in it.
Given an array of integers A of length N, you have to calculate its Primal Power.
 */

public class PrimalPower {
     public static int calculatePrimalPower(int[] A){
         int countPrimeNumbers = 0;
//foreach loop to check whether each number in the array is prime or not
         for(int num: A){
             if(isPrime(num))
             {
                 countPrimeNumbers++;
             }
         }
         return countPrimeNumbers;
     }
//calculating is the number is prime or not
     public static boolean isPrime(int number)
     {
         if(number<=1) return false;

         for(int i=2;i<=Math.sqrt(number);i++)
         {
             if(number % i == 0)
             {
                 return false;
             }
         }
         return true;
     }
    public static void main(String[] args) {
        int[] primes = {7,9,11,13,23,27,29};
       int number =  calculatePrimalPower(primes);
        System.out.println("The number of prime numbers in the array is " + number);
    }
}
