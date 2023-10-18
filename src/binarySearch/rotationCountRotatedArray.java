/* Find the Rotation Count in Rotated Sorted Array */
package binarySearch;

public class rotationCountRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,0,1,2};
        int[] ar = {1,2,3,4,5,6};
        int[] arr = {4,5,6,6,1,2,3};
        System.out.println("No. of Rotations in duplicate array is " + countRotations(nums) + " times");
        System.out.println("No. of Rotations in sorted array " + countRotations(ar) + " times");
        System.out.println("No. of Rotations in duplicate array is " + countRotations(arr) + " times");

    }
    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // Use this for non-duplicates
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

    //Use this when an array contains duplicates
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
