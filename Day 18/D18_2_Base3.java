/*****
 * Given an integer n, return its base 3 representation as a string. Example:
 * Input n = 11
 * Output 102
 * Input Format
 * 7
 *
 * Constraints
 * 0 ≤ n < 2 ** 31
 *
 * Output Format
 * 21
 *
 * Sample Input 0
 * 7
 * Sample Output 0
 * 21
 * Sample Input 1
 * 11
 * Sample Output 1
 * 102
 */

import java.util.Scanner;

public class D18_2_Base3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String result = "";
        while(n != 0) {
            result += n % 3;
            n /= 3;
        }
        for(int i = result.length() - 1; i >= 0; i--) {
            System.out.print(result.charAt(i));
        }
    }
}
