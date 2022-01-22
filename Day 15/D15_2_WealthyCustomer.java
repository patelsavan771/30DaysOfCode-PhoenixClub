/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 *
 * Example: Input:
 *
 * m = 2, n = 3,
 * accounts = [[1,2,3],[3,2,1]]
 * Output:
 *
 * 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 * Input Format
 *
 * m = 2, n = 3,
 * accounts = [[1,2,3],[3,2,1]]
 * Constraints
 *
 * m == accounts.length
 * n == accounts[i].length
 * 1 <= m, n <= 50
 * 1 <= accounts[i][j] <= 100
 * Output Format
 * 6
 *
 * Sample Input 0
 * 2
 * 3
 * 1 2 3
 * 3 2 1
 * Sample Output 0
 * 6
 * Explanation 0
 * 1st customer has wealth = 1 + 2 + 3 = 6 2nd customer has wealth = 3 + 2 + 1 = 6 Both customers are considered the richest with a wealth of 6 each, so return 6.
 *
 * Sample Input 1
 * 3
 * 2
 * 1 5
 * 7 3
 * 2 5
 * Sample Output 1
 * 10
 * Explanation 1
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 */

import java.util.Scanner;

public class D15_2_WealthyCustomer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int max = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
                sum += arr[i][j];
            }
            if(sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
