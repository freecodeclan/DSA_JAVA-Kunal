/*
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
 */
package Patterns;

public class pattern_5 {
    public static void main(String[] args) {
        pattern5(5);

    }
    static void pattern5(int n){
        for (int i=0; i<2*n; i++){
            int totalColsInRow = i > n ? 2*n - i : i;
            for (int j=0; j<totalColsInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
