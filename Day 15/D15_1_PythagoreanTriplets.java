/****
 * Given a list of positive integers nums, return whether there exist integers a, b, and c such that a ** 2 + b ** 2 = c ** 2.
 *
 * Explanation:
 * For e.g.:
 * nums = [5, 1, 7, 4, 3]
 * 3, 4, 5 are in the array and 3^2 + 4^2 = 5^2.
 * Input Format
 * length = 5 nums = 5 1 7 4 3
 *
 * Constraints
 * 0 ≤ n ≤ 1,000 where n is the length of nums
 * Output Format
 * true
 *
 * Sample Input 0
 * 5
 * 5 1 4 7 3
 * Sample Output 0
 * true
 * Explanation 0
 * 3, 4, 5 are in the array and 3^2 + 4^2 = 5^2.
 *
 * Sample Input 1
 * 5
 * 6 4 2 8 10
 * Sample Output 1
 * true
 */

import java.util.Arrays;
import java.util.Scanner;

public class D15_1_PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        boolean flag = false;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if((arr[i] * arr[i]) + (arr[i - 1] * arr[i - 1]) == (arr[j] * arr[j])) {
                    flag = true;
                    break;
                }
            }

        }
        System.out.println(flag);
    }
}
