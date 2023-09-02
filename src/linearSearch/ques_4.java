/* Find the min value and maximum value in an array */
package linearSearch;

import java.util.Scanner;

public class ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.print("Enter the elements of an array:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The minimum value in array is " + min(arr));
        System.out.println("The maximum value in array is " + max(arr));

    }
    static int min(int[] a){
        int min1 = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min1){
                min1 = a[i];
            }
        }
        return min1;
    }
    static int max(int[] a){
        int max1 = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max1){
                max1 = a[i];
            }
        }
        return max1;
    }
}
