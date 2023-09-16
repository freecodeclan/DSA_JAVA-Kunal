/* Missing Number (Leetcode 268)
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 */
package Cycle_Sort;

import java.util.Arrays;

public class ques_2 {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        // Search for first missing number
        for (int index = 0; index < arr.length; index++){
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
