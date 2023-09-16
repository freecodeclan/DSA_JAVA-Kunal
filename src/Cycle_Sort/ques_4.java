/* Find the Duplicate Number (Leetcode 287)
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and use only constant extra space.
 */
package Cycle_Sort;

import java.util.Arrays;

public class ques_4 {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};

        int ans = findDuplicate(arr);

        System.out.println("The duplicate value is " + ans);

    }
    static int findDuplicate(int[] nums){
        int i = 0;
        while (i < nums.length){

            if (nums[i] != i + 1){
                int currentIndex = nums[i] - 1;
                if (nums[i] != nums[currentIndex]){
                    swap(nums, i, currentIndex);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
