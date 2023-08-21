/* Ques 1 => Create a function to add two numbers. */
package Functions;

import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1,  num2,  sum;

        System.out.print("Enter the value for num1: ");
        num1 = in.nextInt();
        System.out.print("Enter the value for num2: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
