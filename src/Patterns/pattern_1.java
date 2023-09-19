/*
    *
    * *
    * * *
    * * * *

 */
package Patterns;

public class pattern_1 {
    public static void main(String[] args) {
        pattern1(4);

    }
    static void pattern1(int n){
        for (int i=0; i<=n;i++){
            // now for every row run the columns
            for(int j=0; j<i;j++){
                System.out.print("* ");
            }
            // Whn one row is printed, we need to print a new line
            System.out.println();
        }
    }
}
