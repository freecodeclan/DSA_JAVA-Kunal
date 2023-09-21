package conditionAndLoops;

import java.util.Scanner;

public class Alphabet_CaseCheck {
    public static void main(String[] args) {

        System.out.println("Enter the character?");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if (ch > 'a' && ch < 'z'){
            System.out.println("It's a lowercase");
        }
        else{
            System.out.println("It's a uppercase");
        }
   }
}
