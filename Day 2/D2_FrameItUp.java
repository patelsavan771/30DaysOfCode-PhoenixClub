import java.util.Scanner;

public class D2_FrameItUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        int prod = 1;

        while(n != 0) {
            int rem = n % 2;
            result = result + (rem * prod);
            prod *= 10;
            n /= 2;
        }
        System.out.println(result);
    }
}


/*****
 * Given a decimal number as input, we need to write a program to convert the given decimal number into equivalent binary number.
 *
 * Input Format
 * 7
 *
 * Constraints
 * 0
 * Output Format
 * 111
 * Sample Input 0
 * 7
 * Sample Output 0
 * 111
 * Sample Input 1
 * 11
 * Sample Output 1
 * 1011
 */