/****
 * You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
 *
 * Given the integer n, return the number of complete rows of the staircase you will build.
 *
 * Input Format
 * n = 5
 *
 * Constraints
 * 1 <= n <= 231 - 1
 * Output Format
 * 2
 *
 * Sample Input 0
 * 5
 * Sample Output 0
 * 2
 * Explanation 0
 * imageBecause the 3rd row is incomplete, we return 2.
 *
 * Sample Input 1
 * 8
 * Sample Output 1
 * 3
 * Explanation 1
 * imageBecause the 4th row is incomplete, we return 3.
 */

import java.util.Scanner;

public class D16_2_CoinGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        while(count * (count + 1) <= 2 * n) {
            count++;
        }
        System.out.println(count - 1);
    }
}
