package conditionAndLoops;

import java.util.Scanner;

public class print_counting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of n: ");
        int num = in.nextInt();
        // Using for loop
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
        System.out.println();
        // Using While loop
        int i = 1;
        while(i <= num){
            System.out.print(i + " ");
            i++;

        }
        System.out.println();
        // Using do while loop
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while(a <= num);
    }
}


