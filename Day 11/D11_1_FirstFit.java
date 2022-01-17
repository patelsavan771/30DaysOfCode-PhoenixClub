import java.util.Scanner;

public class D11_1_FirstFit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();

        int max = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] >= target) {
                max = arr[i];
                break;
            }
        }
        System.out.println(max);
    }
}

/****
 * You are given a list of integer rooms and an integer target. Return the first integer in rooms that's target or larger. If there is no solution, return -1. Example 1: Input:
 *
 * length=5
 * rooms = [15, 10, 30, 50, 25]
 * target = 20
 * Output:
 *
 * 30
 * Explanation:
 *
 * 30 is the first room that's at least as large as 20.
 * Input Format
 *
 * 5
 * 15 10 30 50 25
 * 20
 *
 * Constraints
 *
 * 0 ≤ n ≤ 100,000 where n is the length of room
 *
 * Output Format
 *
 * 30
 *
 * Sample Input 0
 *
 * 5
 * 15 10 30 50 25
 * 20
 * Sample Output 0
 *
 * 30
 * Sample Input 1
 *
 * 5
 * 15 10 30 50 25
 * 51
 * Sample Output 1
 *
 * -1
 */
