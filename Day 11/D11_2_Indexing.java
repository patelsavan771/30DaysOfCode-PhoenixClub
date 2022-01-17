import java.util.Scanner;

public class D11_2_Indexing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            totalSum += arr[i];
        }
        int lSum = 0;
        int rSum = totalSum;
        int result = -1;
        for(int i = 0; i < n; i++) {
            rSum -= arr[i];
            if(lSum == rSum) {
                result = i;
                break;
            }
            lSum += arr[i];
        }
        System.out.println(result);
    }
}

/****
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.If no equilibrium index is found return -1 else return the index. consider the index starting from 0.
 * For example, in an array A:
 *
 * **Example : **
 *
 * length:7
 * Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
 * Output:
 *
 * 3
 * Explanation
 *
 * 3 is an equilibrium index, because:
 * A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 * example:
 *
 * length:3
 * Input: A[] = {1, 2, 3}
 * Output: -1
 * Input Format
 *
 * 6 -7 1 5 2 -4 3 0
 *
 * Constraints
 *
 * the array may contain negative values
 * Output Format
 *
 * 3
 *
 * Sample Input 0
 *
 * 7
 * -7 1 5 2 -4 3 0
 * Sample Output 0
 *
 * 3
 * Sample Input 1
 *
 * 3
 * 1 2 3
 * Sample Output 1
 *
 * -1
 */
