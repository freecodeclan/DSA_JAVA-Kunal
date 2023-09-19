/*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *

 */
package Patterns;

public class pattern_2 {
    public static void main(String[] args) {
        patter2(5);

    }
    static void patter2(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
