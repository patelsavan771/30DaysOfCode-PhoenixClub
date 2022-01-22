/*****
 * Let's call an array arr a mountain if the following properties hold: arr.length >= 3 There exists some i with 0 < i < arr.length - 1 such that: arr[0] < arr[1] < ... arr[i-1] < arr[i] arr[i] > arr[i+1] > ... > arr[arr.length - 1] Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 *
 * Example 1: Input: arr = [0,1,0] Output: 1
 *
 * Example 2: Input: arr = [0,2,1,0] Output: 1
 *
 * Input Format
 * 3 0 1 0
 *
 * Constraints
 * 3 <= arr.length <= 104 0 <= arr[i] <= 106 arr is guaranteed to be a mountain array.
 *
 * Output Format
 * 1
 *
 * Sample Input 0
 * 3
 * 0 1 0
 * Sample Output 0
 * 1
 * Sample Input 1
 * 4
 * 0 2 1 0
 * Sample Output 1
 * 1
 */

import java.util.Scanner;

public class D17_4_FindThePeak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        boolean flag = false;
        for(int i = 0; i < n; i++) {
            if(!anyHigh(arr, i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean anyHigh(int[] arr, int x) {
        int target = arr[x];
        for(int i = 0; i < x; i++) {
            if(arr[i] >= target) {
                return true;
            }
        }
        for(int i = x + 1; i < arr.length; i++) {
            if(arr[i] >= target) {
                return true;
            }
        }
        return false;
    }
}
