/* Peak Index in a Mountain Array (leetcode 852) It is also known as bitonic Array
 */
package binarySearch;

public class ques_8 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8,6,3,2,1};

        int peak = peakIndexInMountainArray(arr);
        System.out.println("The peak index is " + peak);

    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){        // If this condition gets true means we are in decreasing part of array
                end = mid;                      // this may be the ans but look in left part too.
            }
            else{
                start = mid + 1;    // Here, we know that arr[mid] < arr[mid + 1]
            }
        }
        return start;       // In the last start == end and pointing to the largest number bcoz of above two conditions.
    }
}
