/****
 * Given an integer n, return the sum of the first n positive odd integers.
 * Example 1 Input n = 5 Output 25 Explanation The first 5 odd integers are [1, 3, 5, 7, 9] and its sum is 25.
 *
 * Input Format
 * 5
 *
 * Constraints
 * n ≤ 1,000
 *
 * Output Format
 * 25
 *
 * Sample Input 0
 * 5
 * Sample Output 0
 * 25
 */


import java.util.Scanner;

public class D17_1_OddSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = 1; count < n; i = i + 2) {
            count++;
            sum += i;
        }
        System.out.println(sum);
    }
}
