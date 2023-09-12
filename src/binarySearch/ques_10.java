/* Search in Rotated Sorted Array (leetcode 33) Very Imp Ques

There is an integer array nums sorted in ascending order (with distinct values).

Note -- We can do this question in a single method using recursion.
 */
package binarySearch;

public class ques_10 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));

    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);
        /* if we did not find pivot, it means an array is not rotated */
        if(pivot == -1){
            // just do normal binary search
            return binarySearch(nums,target, 0, nums.length - 1);
        }
        /* if pivot is found,you have found two ascending sorted arrays */
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    static int binarySearch(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
}
// Finding the largest value in a sorted rotated array
static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            // Case --1
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            // Case -- 2
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // Case -- 3
            if(arr[mid] < arr[start]){
                end = mid - 1;
            }
            // Case -- 4
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
