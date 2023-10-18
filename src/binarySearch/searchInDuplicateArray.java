/* Search in Duplicate Rotated Sorted Array */
package binarySearch;

public class searchInDuplicateArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,6,1,1,2,2};
        int target = 1;

        System.out.println(search(nums, target));

    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        /* if we did not find pivot, it means an array is not rotated */
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        /* if pivot is found,you have found two ascending sorted arrays */
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Finding the largest value in a Duplicate Sorted rotated array
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Case --1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case -- 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            /* if elements at a middle, start, an end is equal just skip the duplicate */
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates

                // NOTE: what if these elements at start and end are pivot?
                // So, check start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                // Check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // The Left side is sorted, so the pivot should be right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = start + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

