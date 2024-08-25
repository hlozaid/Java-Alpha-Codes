public class Patterns {

    public static void hollow_rec(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int n) {

        //outer 
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        // hollow_rec(4, 5);
        halfPyramid(4);

    }
}
