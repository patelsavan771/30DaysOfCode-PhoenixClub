/***
 * Given a list of numbers nums and a number k, return whether any two elements from the list add up to k. Note: You may not use the same element twice.
 * Numbers can be negative or 0.
 *
 * Input Format
 * 5 35 8 18 3 22 11
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums
 * Output Format
 * True
 *
 * Sample Input 0
 * 5
 * 35 8 18 3 22
 * 11
 * Sample Output 0
 * true
 * Explanation 0
 * 8 + 3 = 11
 *
 * Sample Input 1
 * 4
 * 10 36 22 14
 * 4
 * Sample Output 1
 * false
 * Explanation 1
 * No two numbers in this list add up to 4.
 */

import java.util.Scanner;

public class D14_1_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int sum = s.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == sum) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}
