package ABCD.Recursion;

public class RecursionPractice {

    // Example 1: 3+2+1
    public static int Summation (int n) {   //static so we can call the fn directly without instantiating RecursionPractice class
    // Base Case: WE ARE AT THE END
        if (n <= 0) {
            return 0;
        }

    // Recursive Case: KEEP GOING
    else {
    // 3+ Summation (2)
    // 3+2+Summation (1)
    // 3+2+1 + Summation (0)
    // 3+2+1+0=6
            return n + Summation (n-1);
        }
    }


    //Example 2: 5!
    // 5!>54*3*2*1 --> 54!
    // 4!--> 4*3*2*1
    public static int Factorial (int n) {
        // Base Case:
        if (n <= 1) {
            return 1;
        }

        // Recursive Case
        else {
        // Factorial (4) = 4 * Factorial (3)
        // 4 * 3 * Factorial (2)
        // 4 * 3 * 2 * Factorial (1)
        // 4 * 3 * 2 * 1
            return n * Factorial (n-1);
        }
    }


    // 5^3 = 5*5*5
    // 5^3 = 5*5^2 = 5*5*5^1 = 5*5*5*5^0 = 5*5*5*1
    public static int Exponentiation (int n, int p) {
        // Base Case:

            if (p <=0) {
            return 1;
        }
        // Recursive
        else {
        // 5 * exponentiation (5, 2)
        // 5 * 5 * exponentiation (5, 1)
        // 5 * 5 * 5 * exponentiation (5, 0)
        // 5 * 5 * 5 * 1
            return n * Exponentiation (n, p-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Summation(4));
        System.out.println(Factorial(5));
        System.out.println(Exponentiation(5,3));
    }
}

//ToDo: - Using recursion, do 4 + 3 + 2 + 1
// - Using Recursion, do 5!
// - Using Recursion, do 5^3.