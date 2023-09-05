/* Find First and Last Position of Element in Sorted Array (leetcode 34)
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position
 of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 */
package binarySearch;

import java.util.Arrays;

public class ques_6 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,10};
        int target = 12;

        int[] range = searchRange(nums,target);
        System.out.println(Arrays.toString(range));
    }
        static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        if(start<=end) {
            ans[0] = start;
            ans[1] = end;
        }
            return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}