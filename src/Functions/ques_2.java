/* Ques 2 --> Check whether number is Armstrong or not and print all 3 digit Armstrong numbers */
package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number to be checked whether it is armstrong or not: ");
//        int n = in.nextInt();
//        System.out.println("The given number is " + isArmstrong(n));

        // Printing all 3 digits armstrong number
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)) System.out.print(i + " ");
        }
    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n/ 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }
}
