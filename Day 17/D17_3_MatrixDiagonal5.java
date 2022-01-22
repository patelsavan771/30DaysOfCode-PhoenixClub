/****
 * Given a square n x n matrix, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
 *
 * Input Format
 * n = 3, mat = [[1,2,3], [4,5,6], [7,8,9]]
 *
 * Constraints
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 * Output Format
 * 25
 *
 * Sample Input 0
 * 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Sample Output 0
 * 25
 * Explanation:
 * Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 * Notice that element mat[1][1] = 5 is counted only once.
 * Sample Input 1
 * 4
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * Sample Output 1
 * 8
 * Sample Input 2
 * 1
 * 5
 * Sample Output 2
 * 5
 */

import java.util.Scanner;

public class D17_3_MatrixDiagonal5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] arr = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
                if(i == j) {
                    sum += arr[i][j];
                }
            }
        }
        int temp = n - 1;
        for(int i = 0; i < n; i++) {
            sum += arr[i][temp];
            temp--;
        }
        if(n % 2 == 1) {
            sum = sum - arr[n/2][n/2];
        }
        System.out.println(sum);
    }
}
