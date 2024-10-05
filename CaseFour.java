import java.util.Scanner;

public class CaseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to find next prime number");
            int number = scanner.nextInt();
            int nextPrime = nextPrimeNumber(number);
            System.out.println("The next prime number is " + nextPrime);
            System.out.println();
        }
    }

    protected static Boolean isPrimeNumber(int number) {
        Boolean isPrime = false;
        
        if (number <= 1) {
            isPrime = false;
            // return isPrime;
        } else {
            boolean divisibleByOtherNum = false;
            for (int i = 2; i <= Math.sqrt(number); ++i) {
                if (number % i == 0) {
                    divisibleByOtherNum = true;
                    break;
                }
            }

            if (!divisibleByOtherNum) {
                isPrime = true;
            } else {
                isPrime = false;
            }
        }

        return isPrime;

    }

    protected static int nextPrimeNumber(int inputNum) {
        // int nextPrimeNumValue = 0;
        int nextNum = inputNum + 1;

        // Boolean isPrime = isPrimeNumber(number);
        while (!isPrimeNumber(nextNum)) {
            nextNum++;
        }

        return nextNum;
    }
}

/**
 * Algorithm for solving finding next prime number
 * 
 * 1. Take input from user
 * 2. Call nextPrimeNumber method and pass the input+1 as argument
 * 3. Print the nextPrimeNumber value.
 * 
 * 
 * Algorithm for isPrimeNumber method
 * 1. take the number from user input
 * 2. loop from i = 2 until sqrt(number), i++
 * 3. check if the number is divisible by the i
 * 4. if divisible, the number is not prime number
 * 5. if not divisible, the number is prime number
 * 
 * 
 * Algorithm for nextPrimeNumber method
 * 1. take the number form user input
 * 2. increase the number by 1
 * 3. call the isPrimeNumber method to check if the number is prime number
 * 4. if the number is not prime number, repeat the step above from step 2 until prime is found
 */