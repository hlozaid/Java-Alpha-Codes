public class Function {
    
    public static void printHello(){
        System.out.println("Hello");
    }

    public static void CalSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }


// Fing n Factorial
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        } 
        return f;
    }


//find Binomial Coefficient
    public static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        
        int binCoeff = fact_n / fact_r * fact_nmr;
        return binCoeff;
    }

// Function Overloading...........
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

// function overloading using Data Types.......
    public static float zaid(float a, float b){
        return a+b;
    }

// Find product of a & b
    public static int multiply(int a, int b){
        int product = a * b;
        return product;
    }

//Check if a number is prime or not
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
            
        }
        return isPrime;
    }
    
//optimized approach
    public static boolean isPrim(int n){
        for(int i = 2; i<=Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        } 
        return true;
    }

// Print all primes in a Range
    public static void primeInRange(int n){
        for(int i = 2; i<=n; i++){
            if(isPrim(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

//convert from Binary to Decimal....
    public static void BinToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

// Convert from Decimal to Binary
    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println("Binary from of " + myNum + " = " + binNum);
    }

//main class
    public static void main(String args[]){
        BinToDec(101);
      
    }
}
