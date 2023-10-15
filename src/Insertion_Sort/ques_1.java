/* Sort an array using Insertion Sorting */
package Insertion_Sort;

import java.util.Arrays;

public class ques_1 {
    public static void main(String[] args) {
        int[] arr = {-10, -2, -12, 0, 4, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0; j--){
                if (arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                else {
                    break;
                }
            }
        }

    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
