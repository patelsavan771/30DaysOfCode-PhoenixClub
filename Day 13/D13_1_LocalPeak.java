/****
 * You are given a list of integers nums. Return the index of every peak in the list, sorted in ascending order. An index i is called a peak if:
 *
 * nums[i] > nums[i + 1] if i = 0
 * nums[i] > nums[i - 1] if i = n - 1
 * nums[i - 1] < nums[i] > nums[i + 1] otherwise
 * However, a list of length 1 is not considered a peak.
 *
 * Input Format
 * length = 5, nums = [1, 2, 3, 2, 4]
 * Constraints
 * 0 ≤ n ≤ 100,000 where n is the length of nums
 *
 * Output Format
 * 2 4
 * Sample Input 0
 * 5
 * 1 2 3 2 4
 * Sample Output 0
 * 2 4
 * Explanation 0
 * The values at index 2 and 4 are considered peaks since they are larger than their neighbors.
 *
 * Sample Input 1
 * 4
 * 1 2 1 1
 * Sample Output 1
 * 1
 */

import java.util.Scanner;

public class D13_1_LocalPeak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        String result = "";
        if(arr[0] > arr[1]) {
            result += "0 ";
        }
        for (int i = 1; i < n - 1; i++) {
            if(arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                result += i + " ";
            }
        }

        if(arr[n - 1] > arr[n - 2]) {
            result += (n - 1);
        }
        System.out.println(result);
    }
}

/****
 * nums[i] > nums[i + 1] if i = 0
 * nums[i] > nums[i - 1] if i = n - 1
 * nums[i - 1] < nums[i] > nums[i + 1] otherwise
 */