/****
 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 *
 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 *
 * For example, inverting [0,1,1] results in [1,0,0].
 * Example 1:
 * Input:
 * image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output:
 * [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation:
 * First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Input Format
 * 3 1 1 0 1 0 1 0 0 0
 *
 * Constraint
 * n == image.length
 * n == image[i].length
 * 1 <= n <= 20
 * images[i][j] is either 0 or 1.
 * Output Format
 * 1 0 0 1 0 1 0 0 0
 *
 * Sample Input 0
 * 3
 * 1 1 0
 * 1 0 1
 * 0 0 0
 * Sample Output 0
 * 1 0 0
 * 0 1 0
 * 1 1 1
 * Explanation 0
 * First reverse each row: [[0,1,1],[1,0,1],[0,0,0]]. Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *
 * Sample Input 1
 * 4
 * 1 1 0 0
 * 1 0 0 1
 * 0 1 1 1
 * 1 0 1 0
 * Sample Output 1
 * 1 1 0 0
 * 0 1 1 0
 * 0 0 0 1
 * 1 0 1 0
 * Explanation 1
 * First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]. Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */

import java.util.Scanner;

public class D16_3_UpOrDown {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                arr[i][j] = s.nextInt();
                arr[i][j] = arr[i][j] == 1 ? 0 : 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
