public class Patterns {

    public static void hollow_rec(int totRows, int totCols){
        //outer loop

        for(int i= 1; i <= totRows; i++){

            //inner - columns
            for(int j = 1; j<= totCols; j++){
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){    //boundary cells 

                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
    
    public static void inverted_rotated_half_pyramid(int n) {
        //outer
        for(int  i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++){
            System.out.print(" ");
           } 

           //Stars
           for(int j=1; j<=i; j++) {
            System.out.print("*");
           }

           System.out.println();
        }

    }

    public static void inverted_half_pyramid_withNum(int n) {
        for (int i=1; i<=n; i++) {
            //inner - numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n){
        //outer
        int counter = 1;
        for (int i = 1; i<=n; i++){
            //inner - how many times will counter be printed
            for(int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            } 
            System.out.println();
        }
    }

    public static void Zero_oneTraingle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j) % 2== 0){ //even
                    System.out.print("1");
                }else{ //odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //1st half
        for(int i=1; i<=n; i++){
            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) { 
           //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    public static void solidRhombus(int n){
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // hollow_rec(5, 4);
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid_withNum(4);
        // floyds_triangle(5);
        // Zero_oneTraingle(5);
        // butterfly(4);
        solidRhombus(5);
    }
    
}
