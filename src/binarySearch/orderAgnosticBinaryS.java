/* Find the indexValue of the targeted value using Order-Agnostic Binary Search */
package binarySearch;

public class orderAgnosticBinaryS {
    public static void main(String[] args) {
        int[] ar = {5,10,12,15,20,25};
        int target = 20;

        int ans = orderAgnosticBS(ar, target);
        System.out.println(ans);

    }
    static int orderAgnosticBS(int[] arr, int t){
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
        return -1;
    }
}
