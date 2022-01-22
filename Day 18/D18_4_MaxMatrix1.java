/***
 * Given a two-dimensional n x n integer matrix, return the total number of integers whose value is the largest in its row and in its column.
 * Input Format
 * n = 3,
 * matrix = [ [1, 3, 2], [6, 6, 5], [1, 5, 7] ]
 *
 * Constraints
 * n ≤ 250 where n is the number of rows and columns in matrix
 * Output Format
 * 3
 *
 * Sample Input 0
 * 3
 * 1 3 2
 * 6 6 5
 * 1 5 7
 * Sample Output 0
 * 3
 * Explanation 0
 * The 3 big numbers are 6, 6, and 7.
 *
 * Sample Input 1
 * 4
 * 1 2 3 2
 * 3 2 3 2
 * 1 2 2 3
 * 1 1 1 1
 * Sample Output 1
 * 4
 */

import java.util.Scanner;

public class D18_4_MaxMatrix1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for(int k = 0; k < n; k++) {
                    if(arr[i][k] > arr[i][j]) {
                        flag = false;
                        break;
                    }
                    if(arr[k][j] > arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
