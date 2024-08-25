import java.util.*;

//BIll of items
public class GST{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Total = pencil + pen + eraser;

        System.out.println("BIll is : " + Total);

        //add on - with 18% GSt
        float newTotal = Total + (0.18f + Total);
        
        System.out.println(newTotal);
    }
}