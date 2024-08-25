import java.util.*;


public class Arrays{

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static int LinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }

        return -1;
    }

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }

            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest value is : " + smallest);
        return largest;
    }

    //Binary Search
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            
            //comparisons
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }

        return -1;

    }

   // Reverse an array
   public static void reverseArray(int numbers[]){
    int first = 0, last = numbers.length-1;
    while(first < last){
        //swap
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;

        first++;
        last--;
    }
   }

   //pairs in an array
   public static void printPairs(int numbers[]){
    for(int i = 0; i<numbers.length; i++){
        int curr = numbers[i]; //{2,4,6,8,10}
        for(int j = i+1; j<numbers.length; j++){
            System.out.print("(" + curr + "," + numbers[j] + ")");
        }
        System.out.println();
    }
   }
   

//-------------------------------Main Class---------------------------------//
    public static void main(String args[]){

        int marks[] = {2, 4, 6, 8, 10, 12, 14, 16};

        Scanner sc = new Scanner(System.in);
       
        // int marks[] = new int[100];

        // Scanner sc = new Scanner(System.in);
        // // int py;
        // // py = sc.nextInt();

        // marks[0] = sc.nextInt();    //phy
        // marks[1] = sc.nextInt();    //chem
        // marks[2] = sc.nextInt();    //math

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("math : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage" + percentage + "%");

        // System.out.println("length of array = " + marks.length); //length of array


        // update(marks);
        
        // // print our marks

        // for(int i=0; i<marks.length; i++){
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();

//------------------------------------Linear Search-------------//

            // int numbers[] = {2,4,6,8,10,12,14,16};
            // // int key = 10;
            // System.out.print("Enter Keys : ");
            // int key = sc.nextInt();

            // int index = LinearSearch(numbers, key);
            // if(index == -1){
            //     System.out.println(" Key Not Found");
            // } else{
            //     System.out.println("key is at index : " + index);
            // }

//------------------------------- Largest Number ---------------------//
            // int numbers[] = {1,2,6,3,5};
            // System.out.println("Largest value is: " + getLargest(numbers));

//------------------------------- Binary Search----------------------//
            // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
            // int key = 10;

            // System.out.println("index for key is : " + binarySearch(numbers, key));

//------------------------------------- Reverse an array--------------------//
        // int numbers[] = {2,4,6,8,10};
        // reverseArray(numbers);
        // //print
        // for(int i = 0; i<numbers.length; i++){
        //     System.out.print(numbers[i]+ " ");
        // }
        // System.out.println();

//-------------------------------------Pairs in an Array--------------------//

        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);


    }
}