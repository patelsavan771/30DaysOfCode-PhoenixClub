import java.util.Arrays;
import java.util.Scanner;

public class D7_2_LagestOfAll {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        if(arr[n - 1] > arr[n - 2] * 2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

/*****
 * Given a list of integers nums, return whether the largest number is bigger than the second-largest number by more than two times.
 * Array can be in unsorted manner.
 *
 * Input Format
 *
 * n = 3 nums = [3, 9, 6]
 *
 * Constraints
 *
 * 2 ≤ n ≤ 100,000 where n is the length of nums
 *
 * Output Format
 *
 * false
 * 9 is not bigger than 2 * 6.
 *
 * Sample Input 0
 *
 * 3
 * 3 19 9
 * Sample Output 0
 *
 * true
 * Sample Input 1
 *
 * 3
 * 3 6 12
 * Sample Output 1
 *
 * false
 * Explanation 1
 *
 * 12 is not bigger than 2 * 6, they're equal.
 */
