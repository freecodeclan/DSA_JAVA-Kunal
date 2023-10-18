/* Find the floor of a target number in an array */
package binarySearch;

public class floorOfTargetNum {
    public static void main(String[] args) {
        int[] ar = {2, 3, 5, 9, 13, 15, 18};

        int target = 20;

        int floorNumber = floorNum(ar,target);
        System.out.println(floorNumber);
    }

    static int floorNum(int[] arr, int t){
        int start = 0;
        int end = arr.length - 1;

        // Finding array is sorted in ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]) isAsc = true;
        else isAsc = false;

        while(start <= end){
            // find mid element
            int mid = start + (end - start) / 2;
            if(arr[mid] == t){
                return mid;
            }
            if(isAsc){
                if(t < arr[mid]){
                    end = mid - 1;
                }
                else if(t > arr[mid]){
                    start = mid + 1;
                }
                else{
                    if(t > arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }

                }
            }

        }
        return end;       // In floor of a number instead of returning -1 we just return end.
    }
}
