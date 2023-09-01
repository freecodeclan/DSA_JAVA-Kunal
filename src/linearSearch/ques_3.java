/* Find the value in the given range and return the index value */
package linearSearch;

import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("Enter the elements of array");
       for(int i=0; i<arr.length;i++){
           arr[i] = a.nextInt();
       }
        System.out.print("Enter the targeted value to be searched: ");
       int target = a.nextInt();

       int range = searchRange(arr, target,1, 6);
        System.out.println("The targeted value index value is " + range);
    }
    static int searchRange(int[] ar, int target, int start, int end){
        if(ar.length == 0){
            return -1;
        }
        for(int i = start; i <= end; i++){
            int element = ar[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

}
