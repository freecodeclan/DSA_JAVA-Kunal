/* Find position of an element in a sorted array of infinite numbers */
package binarySearch;

public class ques_7 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println(findRange(arr,target));

    }
    static int findRange( int[] arr, int target){
        // we'll first find the range where we'll apply binary search
        // So, to find range we'll start with a box of 2
        int start = 0;      // index value of array
        int end = 1;        // index value of array

        // Condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // Double the box value
            end = end + (end - start + 1) * 2;      // Formula used here, "end = previousEnd + sizeOfBox * 2"
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
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
}
