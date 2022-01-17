import java.util.Scanner;

public class D12_3_OddFromMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int lenOfIn = s.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < lenOfIn; i++) {
            int ri = s.nextInt();
            for(int j = 0; j < n; j++) {
                matrix[ri][j]++;
            }
            int ci = s.nextInt();
            for(int j = 0; j < m; j++) {
                matrix[j][ci]++;
            }
        }
        int result = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] % 2 != 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}


/****
 * There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
 *
 * For each location indices[i], do both of the following:
 *
 * Increment all the cells on row ri.
 * Increment all the cells on column ci.
 * Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
 *
 * Input Format
 *
 * m = 2, n = 3, length of indices=2, indices = [[0,1],[1,1]]
 * Constraints
 *
 * 1 <= m, n <= 50
 * 1 <= indices.length <= 100
 * 0 <= ri < m
 * 0 <= ci < n
 * Output Format
 *
 * 6
 * Sample Input 0
 *
 * 2
 * 3
 * 2
 * 0 1 1 1
 * Sample Output 0
 *
 * 6
 * Explanation 0
 *
 * imageInput:
 *
 * m = 2, n = 3, length of indices=2, indices = [[0,1],[1,1]]
 * Output:
 *
 * 6
 * Explanation:
 *
 * Initial matrix = [[0,0,0],[0,0,0]].
 * After applying first increment it becomes [[1,2,1],[0,1,0]].
 * The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
 * Sample Input 1
 *
 * 2
 * 2
 * 2
 * 0 0 1 1
 * Sample Output 1
 *
 * 0
 * Explanation 1
 *
 * imageInput:
 *
 * m = 2, n = 2, length of indices=2, indices = [[1,1],[0,0]]
 * Output:
 *
 * 0
 * Explanation:
 *
 * Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
 */
