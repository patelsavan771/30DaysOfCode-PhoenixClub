/***
 * The factorial of a number n is defined as n! = n * (n - 1) * (n - 2) * ... * 1. For e.g.: If a = 6, then output will be 3 Explanation 3! = 6
 *
 * Input Format
 * 6
 *
 * Constraints
 * 0 < a < 2 ** 31
 *
 * Output Format
 * 3
 *
 * Sample Input 0
 * 6
 * Sample Output 0
 * 3
 * Sample Input 1
 * 10
 * Sample Output 1
 * -1
 */

import java.util.Scanner;

public class D17_2_InverseFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 1;
        boolean flag = true;
        while(n != 1) {
            if(n % x == 0) {
                n /= x;
                x++;
            }
            else {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(x - 1);
        }
        else {
            System.out.println(-1);
        }
    }
}
