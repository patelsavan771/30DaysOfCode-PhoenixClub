import java.util.Scanner;

public class D1_PlayingWithDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = input.nextInt();
        int sum = 0;
        int prod = 1;

        while(num != 0) {
            sum += (num % 10);
            prod *= (num % 10);
            num /= 10;
        }
        System.out.println(Math.abs(prod - sum));
    }
}


/*********
 * Take 'n' as the first line of input ('n' is total number of digits). Then input the number with 'n' digits in new line. Find the sum of digits and product of digits and then the difference of them.
 *
 * Input Format
 * 3
 * 234
 *
 * Constraints
 * 0 < n < 5
 *
 * Output Format
 * 15
 *
 * Sample Input 0
 * 4
 * 4421
 * Sample Output 0
 * 21
 */
