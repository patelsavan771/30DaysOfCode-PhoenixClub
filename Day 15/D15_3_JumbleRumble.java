/****
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 * First line of input contains 2N (2N is the numbe of elements) The second line contains array on 2N elements seperated by spaces
 *
 * Example 1: Input:
 * legth = 6 nums = [2,5,1,3,4,7], n = 3
 * Output:
 *
 * [2,3,5,4,1,7]
 * Explanation:
 *
 * Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 * Example 2:
 * Input: length= 8 nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 * Input Format
 *
 * 3 2 5 1 3 4 7
 *
 * Constraints
 * 1 <= n <= 500 nums.length == 2n 1 <= nums[i] <= 10^3
 *
 * Output Format
 * 2 3 5 4 1 7
 *
 * Sample Input 0
 * 3
 * 2 5 1 3 4 7
 * Sample Output 0
 * 2 3 5 4 1 7
 * Sample Input 1
 * 4
 * 1 2 3 4 4 3 2 1
 * Sample Output 1
 * 1 4 2 3 3 2 4 1
 */

import java.util.Scanner;

public class D15_3_JumbleRumble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i += 2) {
            arr[i] = s.nextInt();
        }
        for (int i = 1; i < 2 * n; i += 2) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < 2 * n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
