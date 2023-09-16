/* Sort an array using cycle sorting */
package Cycle_Sort;

import java.util.Arrays;

public class ques_1  {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cycleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1; // Index = Value - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
