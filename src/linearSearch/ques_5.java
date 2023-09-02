/* Given an array nums of integers, return how many of them contain an even number of digits. (Leetcode ques 1295)*/
package linearSearch;

public class ques_5 {
    public static void main(String[] args) {
        int[] num = {12,345,2,6,7896,14};
        System.out.println(findNumbers(num));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;

    }
    // Function to check whether number is even or not
     static boolean even(int num) {
        int numOfDigits = countDigits2(num);
         return numOfDigits % 2 == 0;
     }
     // Function to count the number of digits in integer
//    static int countDigits(int num){
//        if(num < 0){
//            num = num * -1;
//        }
//        int count = 0;
//        while(num > 0){
//            count++;
//            num = num / 10;
//        }
//        return count;
//    }
    // Another way to count the digits
    static int countDigits2(int num){
        return (int)(Math.log10(num)) + 1;
    }

}
