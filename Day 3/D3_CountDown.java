import java.util.Scanner;

public class D3_CountDown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        if(n.length() % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}


/******
 * given a number check whether it contains even number of digits or odd number of digits. consider thw sample case given below.
 *
 * Input Format
 *
 * 12
 *
 * Constraints
 *
 * 1 <= nums.length <= 500
 *
 * Output Format
 *
 * Even
 *
 * Sample Input 0
 *
 * 12
 * Sample Output 0
 *
 * Even
 */
