package Array;

import java.util.Arrays;
import java.util.Scanner;



public class ques_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] rollNo = new int[5];
//        System.out.println("Enter the elements of an array");
//        for(int i = 0; i<rollNo.length; i++){
//            rollNo[i] = in.nextInt();
//        }
//        System.out.println("Entered array looks like ");
////        for( int num : rollNo){
////            System.out.print(num + " ");
////        }
//        System.out.println(Arrays.toString(rollNo));
        String[] str = new String[4];
        System.out.println("Enter the names of car: ");
        for(int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println("Here the beauties are: ");
//        System.out.println(Arrays.toString(str));
        for(String num : str){
            System.out.print(num + " ");
            System.out.println("Hello World");
        }
        }



    }
