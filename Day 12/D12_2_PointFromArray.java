import java.util.Scanner;

public class D12_2_PointFromArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int l = 0;
        int h = n - 1;

        while(l < h) {
            int mid = l + (h - l) / 2;
            if(mid == arr[mid]) {
                h = mid;
            }
            else if(arr[mid] < mid) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        if(arr[l] == l) {
            System.out.println(l);
        }
        else {
            System.out.println(-1);
        }
    }
}

/**
 * Given a list of unique integers nums sorted in ascending order, return the minimum i such that nums[i] == i. If there's no solution, return -1.
 * This should be done in \mathcal{O}(log(n))O(log(n)) time.
 *
 * Input Format
 * length = 5
 * arr = -5  -2  0  3  4
 * Constraints
 *
 * n ≤ 100,000 where n is the length of nums.
 * Output Forma
 * 3
 *
 * Sample Input 0
 * 5
 * -5 -2 0 3 4
 * Sample Output 0
 * 3
 * Explanation 0
 * Both nums[3] == 3 and nums[4] == 4 but 3 is smaller.
 *
 * Sample Input 1
 * 3
 * -5 -4 0
 * Sample Output 1
 * -1
 * Explanation 1
 * There's no i such that nums[i] = i.
 */
