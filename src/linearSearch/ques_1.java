/* Find the targeted value from an array using Linear Search */
package linearSearch;

import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the elements into an array: ");
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target value to be found from an array: ");
        int target = in.nextInt();

        int ans = linearSearch(arr,target);
        System.out.println("The index value of targeted value is: " + ans);

    }
    static int linearSearch(int[] a, int target){
        if (a.length == 0){
            return -1;
        }
        for(int i = 0; i < a.length; i++){
            int element = a[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }

}
