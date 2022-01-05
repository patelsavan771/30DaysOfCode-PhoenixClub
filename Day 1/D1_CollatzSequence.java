import java.util.Scanner;

public class D1_CollatzSequence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;

        while (n != 1) {
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
            result++;
        }
        System.out.println(result + 1); // to include 1

    }
}


/******
 * The Collatz sequence is generated sequentially where
 *
 * n = n / 2 if n is even
 * n = 3 * n + 1 if n is odd
 * And the sequence ends if n = 1
 * N = 11;
 * Output: 15
 * Explanation:
 * The Collatz sequence is: [11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1] and its length is 15.
 *
 * Input Format
 * Input is simple number. Output the size of colatz sequence. 6
 *
 * Constraints
 * 0 < n < 10000
 *
 * Output Format
 * 9
 *
 * Sample Input 0
 * 6
 * Sample Output 0
 * 9
 */
