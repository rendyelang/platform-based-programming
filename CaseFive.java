import java.util.Scanner;

public class CaseFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the initial value: ");
            int initalValue = scan.nextInt();

            System.out.println("Enter the final value: ");
            int finalValue = scan.nextInt();

            int sumPrimes = sumPrimeNumbers(initalValue, finalValue);
            System.out.println("The prime number sum from " + initalValue + " to " + finalValue + " is " + sumPrimes);
        }
    }

    protected static Boolean isPrimeNumber(int number) {
        Boolean isPrime = false;

        if (number <= 1) {
            isPrime = false;
        } else {
            Boolean isDivisibleByOtherNum = false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number %i == 0) {
                    isDivisibleByOtherNum = true;
                    break;
                }
            }
            if (!isDivisibleByOtherNum) {
                isPrime = true;
            } else {
                isPrime = false;
            }
        }

        return isPrime;
    }

    protected static int sumPrimeNumbers(int initalInput, int finalInput) {
        int sumPrime = 0;

        for (int i = initalInput; i <= finalInput; i++) {
            if (isPrimeNumber(i)) {
                sumPrime += i;
            }
        }

        return sumPrime;
    }
}

/**
 * Solution main program Algorithm
 * 1. take user input for initalInput and finalInput
 * 2. call sumPrimeNumbers method with initalInput and finalInput as parameter
 * 3. print the result
 * 
 * 
 * sumPrimeNumbers method Algorithm
 * 1. create sumPrimeNumbers method that has int initalInput and int finalInput as parameter
 * 2. create int sum as 0
 * 3. iterate from initalInput to finalInput
 * 4. check if the current number is prime number by calling isPrime method
 * 5. if the current number is prime number, add the current number to sum
 * 6. return sum
 * 
 * 
 * isPrime method Algorithm
 * 1. create isPrime method that has int number as parameter
 * 2. check if the number is less than or equal to 1, return false
 * 3. iterate from 2 to square root of number
 * 4. create isDivisible parameter as false
 * 5. check if the number is divisible by the current iteration number
 * 7. if the number is divisible by the current iteration number, isDivisible = true
 * 8. check if isDivisible is true, the method returning false
 * 9. return true
 */