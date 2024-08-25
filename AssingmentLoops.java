import java.util.*;

public class AssingmentLoops {
    public static void main(String args[]){

/*
Question (1)

        for(int i=0; i<5; i++){
            System.out.println("Hello World");
            i = i+2;
        }

 */

        Scanner sc = new Scanner(System.in);
         int number;
         int choice;
         int evenSum = 0;
         int oddSum = 0;

         do{
            System.out.println("Enter the number");
            number = sc.nextInt();
             
            if(number%2==0){
                evenSum += number;
                System.out.println(evenSum + " : Number is Even");
            } else {
                oddSum += number;
                System.out.println(oddSum + " : Number is odd");
            }
            System.out.println("DO you want to coutinue? press 1 for Yes or 0 for no");
            choice = sc.nextInt();
         } while(choice==1);
         System.out.println("Sum of even number:" + evenSum);
         System.out.println("Sum of odd number:" + oddSum); 


        

    }
}
