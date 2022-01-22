/*****
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * For e.g.:
 *
 * Input:
 *
 * n = 19
 * Output:
 *
 * true
 * Explanation:
 *
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * Input Format
 *
 * 19
 *
 * Constraints
 *
 * 1 <= n <= 231 - 1
 * Output Format
 * true
 *
 * Sample Input 0
 * 19
 * Sample Output 0
 * true
 * Explanation 0
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * Sample Input 1
 * 2
 * Sample Output 1
 * false
 */

import java.util.ArrayList;
import java.util.Scanner;

public class D14_2_NumbersHappiness {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();

        while(true) {
            if(n == 1) {
                flag = true;
                break;
            }
            n = digitSq(n);
            if(list.contains(n)) {
                flag = false;
                break;
            }
            list.add(n);
        }
        System.out.println(flag);
    }

    public static int digitSq(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}
