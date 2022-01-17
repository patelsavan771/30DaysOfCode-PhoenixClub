import java.util.Scanner;

public class D7_1_AvgGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        boolean flag = false;

        for(int i = 0; i < n; i++) {
            if((sum - arr[i]) / (n - 1) == k ) {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}


/*****
 *
 * Given a list of integers nums and an integer k, return true if you can remove exactly one element from the list to make the average equal to exactly k.
 *
 * Input Format
 * Here n is length of nums, k is the avetage number and nums is the array.
 * n = 4
 * k = 2
 * nums = [1, 2, 3, 10]
 *
 * Constraints
 * 2 ≤ n ≤ 1,000 where n is length of nums
 * nums[i], k ≤ 1,000,000
 *
 * Output Format
 * true
 *
 * Sample Input 0
 * 4
 * 2
 * 1 2 3 10
 * Sample Output 0
 * true
 * Explanation 0
 * We can take 10 out to reach an average of 2 since (1 + 2 + 3) / 3 = 2
 *
 * Sample Input 1
 * 2
 * 2
 * 1 3
 * Sample Output 1
 * false
 */
