import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]){
        // Print the largest of 3 number

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of A: ");
        int a = sc.nextInt();

        System.out.println("Enter Value of B");
        int b = sc.nextInt();

        System.out.println("Enter Value of C: ");
        int c = sc.nextInt();

       if((a>=b) && (a>=c)){
        System.out.println("A is largest");
       }
       else if (b>=c){
        System.out.println("B is largest");
       }
       else{
        System.out.println("C is largest");
       }

    }
}
