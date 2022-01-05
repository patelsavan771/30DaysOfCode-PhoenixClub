import java.util.Scanner;

public class D2_UnfriendlyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        while(n != 0) {
            arr[n % 10]++;
            n /= 10;
        }
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            if(arr[i] > 1) {
                System.out.println("The number is unlucky.");
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("true");
        }
    }
}

/*****
 *Raam is superstitious. He will only use a number as a roll number if all digits of the number are different(i.e. no digits are repeated)
 *
 * Return boolean string as output, print true if all digits are different and false if there are repetitions.
 *
 * Input Format
 * 983
 *
 * Constraints
 * 0
 * Output Format
 * true
 * Sample Input 0
 * 9838
 * Sample Output 0
 * The number is unlucky.
 * Sample Input 1
 * 1234
 * Sample Output 1
 * The number is lucky.
 */
