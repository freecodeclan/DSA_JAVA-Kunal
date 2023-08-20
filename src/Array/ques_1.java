/* Swapping two numbers */
package Array;

import java.util.Arrays;
import java.util.Scanner;


public class ques_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first element to be swapped");
        int a  = in.nextInt();
        System.out.println("Enter the second element to be swapped");
        int b = in.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);
        }
}
