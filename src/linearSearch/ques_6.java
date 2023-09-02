/* Richest Customer Wealth (LeetCode 1672)
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
i customer has in the j bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is
the customer that has the maximum wealth.
 */
package linearSearch;

public class ques_6 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,4}};
        int wealth = maximumWealth(accounts);
        System.out.println(wealth);
    }
    static  int maximumWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
