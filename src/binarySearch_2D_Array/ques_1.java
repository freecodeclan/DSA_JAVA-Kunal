/* Find the target value in 2D Array */
package binarySearch_2D_Array;

import java.util.Arrays;

public class ques_1 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 50},
        };
        int target = 35;

        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;

        while(row < matrix.length && column >= 0){
            if (matrix[row][column] == target){
                return new int[]{row,column};
            }
            if (matrix[row][column] < target){
                row++;
            }
            else{
                column--;       // if (matrix[row][column] > target)
            }
        }
        return new int[]{-1, -1};
    }
}
