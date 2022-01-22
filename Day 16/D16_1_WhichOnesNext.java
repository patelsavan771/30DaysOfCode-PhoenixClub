/****
 * Given a list of integers nums, return the number of elements x there are such that x + 1 exists as well.
 *
 * Explanation:
 *
 * For e.g.:
 *
 * nums = [3, 1, 2, 2, 7],
 * We can take
 * 1. 1 since 1 + 1 exists in the list.
 * 2. 2 since 2 + 1 exists in the list.
 * 3. Another 2.
 * So total output is 3.
 * Input Format
 * length = 5,
 *
 * nums = [3, 1, 2, 2, 7]
 *
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums
 * Output Format
 * 3
 *
 * Sample Input 0
 * 5
 * 3 1 2 2 7
 * Sample Output 0
 * 3
 * Explanation 0
 * We can take
 *
 * 1 since 1 + 1 exists in the list.
 * 2 since 2 + 1 exists in the list.
 * Another 2.
 * So total output is 3.
 *
 * Sample Input 1
 * 6
 * 5 4 3 2 2 7
 * Sample Output 1
 * 4
 */

import java.util.Scanner;

public class D16_1_WhichOnesNext {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[j] == arr[i] + 1) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
