import java.util.*;

public class FunctionAndMethods {
    public static void hello() {
        System.out.println("Hello World");
    }

    public static void CalSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int Multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }

    public static int BiCoeff(int n, int r) {
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // sum of two no.
    public static int Sum(int a, int b) {
        return a + b;
    }

    // sum of three number.
    public static int Sum(int a, int b, int c) {
        return a + b + c;
    }

    // sum of float number
    public static float Sum(float a, float b) {
        return a + b;
    }

    // public static boolean isPrime(int n) {
    // boolean isPrime = true;
    // for (int i = 2; i < n - i; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // break;
    // }
    // }
    // return isPrime;
    // }

    // optimized method to check if a number is Prime or Not
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) { // if true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n >0) {
            int rem = n % 2;
            binNum = binNum +(rem *(int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }

        System.out.println("Binary form of" + myNum + " = "+ binNum);
    }
    
    public static void main(String args[]) {
        decToBin(7
        );

    }
}