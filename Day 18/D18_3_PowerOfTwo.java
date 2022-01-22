/***
 * You are given a list of integers nums. Return the number of pairs i < j such that nums[i] + nums[j] is equal to 2 ** k for some 0 ≤ k.
 *
 * input: first line contains N, the number of elements second line contains N elements.
 *
 * Input Format
 * 4 1 1 3 5
 *
 * Constraints
 * 0 ≤ n ≤ 100,000
 *
 * Output Format
 * 4
 *
 * Sample Input 0
 * 4
 * 1 1 3 5
 * Sample Output 0
 * 4
 * Sample Input 1
 * 4
 * 16 11 32 11
 * Sample Output 1
 * 0
 */

import java.util.Scanner;

public class D18_3_PowerOfTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int result = 0;

        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(isValid(arr[i] + arr[j])) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean isValid(int n) {
        while(n != 1) {
            if(n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
