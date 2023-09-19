/*
    * * * *
    * * *
    * *
    *

 */
package Patterns;

public class pattern_3 {
    public static void main(String[] args) {
        pattern3(4);

    }
    static void pattern3(int n){
        for (int i = 0; i < n; i++){
            for (int j = 1; j < n - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
