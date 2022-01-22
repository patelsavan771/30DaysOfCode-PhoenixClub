/***
 * You are given a list nums of length n + 1 picked from the range 1, 2, ..., n. By the pigeonhole principle, there must be a duplicate. Find and return it. There is guaranteed to be exactly one duplicate. Bonus: Can you do this in \mathcal{O}(n) O(n) time and \mathcal{O}(1) O(1) space?
 *
 * Example 1 Input length=4 nums = [1, 2, 3, 1] Output 1
 *
 * Input Format
 * 5 4 2 1 3 2
 *
 * Constraints
 * n ≤ 10,000
 *
 * Output Format
 * 2
 *
 * Sample Input 0
 * 4
 * 1 2 3 1
 * Sample Output 0
 * 1
 * Sample Input 1
 * 5
 * 4 2 1 3 2
 * Sample Output 1
 * 2
 */

import java.util.Arrays;
import java.util.Scanner;

public class D14_3_FindMyTwin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
//        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
//            sum += arr[i];
        }
        Arrays.sort(arr);
        int result = 0;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                result = arr[i];
                break;
            }
        }
//        int realSum = (n * (n - 1)) / 2;
        System.out.println(result);
    }
}
