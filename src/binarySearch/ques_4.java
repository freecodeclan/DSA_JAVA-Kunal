/* Find the floor of a target number in an array */
package binarySearch;

public class ques_4 {
    public static void main(String[] args) {
        int[] ar = {2, 3, 5, 9, 13, 15, 18};

        int target = 20;

        int floorNumber = floorNum(ar,target);
        System.out.println(floorNumber);
    }

    static int floorNum(int[] arr, int t){
        int s = 0;
        int e = arr.length - 1;

        // Finding array is sorted in ascending or descending
        boolean isAsc;
        if (arr[s] < arr[e]) isAsc = true;
        else isAsc = false;

        while(s <= e){
            // find mid element
            int mid = s + (e - s) / 2;
            if(arr[mid] == t){
                return mid;
            }
            if(isAsc){
                if(t < arr[mid]){
                    e = mid - 1;
                }
                else if(t > arr[mid]){
                    s = mid + 1;
                }
                else{
                    if(t > arr[mid]){
                        e = mid - 1;
                    }
                    else{
                        s = mid + 1;
                    }

                }
            }

        }
        return e;       // In floor of a number instead of returning -1 we just return end.
    }
}
