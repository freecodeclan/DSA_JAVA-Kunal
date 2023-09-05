/* Find the indexValue of the targeted value using Binary Search */
package binarySearch;

public class ques_1 {
    public static void main(String[] args) {
        int[] a = {2,6,8,10,14,18,20};
        int target = 15;

        int indexValue = binarySearch(a,target);
        System.out.println("The index value of target value is " + indexValue);

    }
    static int binarySearch(int[] arr, int t){
        int start = 0;
         int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (t < arr[mid]){
                end = mid - 1;
            }
            else if(t > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

