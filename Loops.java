import java.util.*;
public class Loops {
    public static void main(String args[]){


//-------------------------------------> While Loops <----------------------------------------------- 

      /*  int counter = 0;
        while(counter<100){
            System.out.println("hello World");
            counter++;
        }
         */
         

         //print number from 1 to 10

         /*
         int counter = 1;
         while(counter<=10){
            System.out.println(counter);
            counter++;
         } 
         
         */


         //print number from 1 to n

         /*
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter N number:  ");
         int range = sc.nextInt();
         
        int counter = 1;
        while(counter<=range){
            System.out.println(counter + " ");
            counter++;
        }
         */

//-----------> Print sum of first n natural Number.
/*

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First N natural Number:  ");

        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        
         */

//--------------------------------------------------------------> for Loop <------------------------------------------------------------


/*
        for(int i = 1; i<=10;i++){
            System.out.println("Hello World");
        }


         */

         //____________________________________>Print Square Patterns:<__________________________________
/*
         for(int line=1; line<=4; line++){
            System.out.println("*  *  *  *");
         }


         */


//------------------------------------------->do - while Loop<----------------------------------------

int counter = 1;
 do {
    System.out.println("Hello World");
    counter++;
 }while(counter<=5);



    }
}
