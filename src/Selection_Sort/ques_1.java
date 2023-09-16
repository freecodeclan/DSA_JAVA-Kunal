/* Sort an array using Selection Sort */
package Selection_Sort;

import java.util.Arrays;

public class ques_1 {
    public static void main(String[] args) {
        int[] arr = {5,8,10,1,12};
        int[] brr = {6, 3, -10, -5, 4, 1};
        int[] crr = {12,10,11};
        selectionSort(arr);
        selectionSort(brr);
        selectionSort(crr);

        System.out.println("The unsorted Array in a sorted manner " + Arrays.toString(arr));
        System.out.println("The negative value unsorted Array  in a sorted manner  " + Arrays.toString(brr));
        System.out.println("The 3 value unsorted Array in a sorted manner " + Arrays.toString(crr));

    }
    static void selectionSort(int[] arr){
          for (int i = 0; i < arr.length; i++ ){
              // find the max item int the remaining array and swap with correct index
              int last = arr.length - i - 1;
              int maxIndex = getMaxIndex(arr,0, last);
              swap(arr,maxIndex,last);
          }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = 0;
        for (int i = 0; i <= last; i++ ){
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
