/*****
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * The fist line of input contains i, that is lenght of the array. The second line of array Nums contains i elements. And the third line contains the target element to be found.
 *
 * Input Format
 * length = 4
 * nums = [1, 3, 5, 6]
 * target = 5
 *
 * Constraints
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 * Output Format
 * 2
 *
 * Sample Input 0
 * 6
 * 1 3 5 6 13 64
 * 13
 * Sample Output 0
 * 4
 * Sample Input
 * 4
 * 1 3 5 6
 * 5
 * Sample Output 1
 * 2
 */

import java.util.Scanner;

public class D16_4_FindMe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }


        System.out.println(n);
    }
}
