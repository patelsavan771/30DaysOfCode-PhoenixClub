import java.util.Scanner;

public class D2_KeepArranging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        System.out.println((int)(harmonic(n) * 10000) / 10000.0);
//        System.out.println(harmonic(n));
        System.out.printf("Harmonic sum upto 4 decimal places: %.4f",harmonic(n));

    }
    public static double harmonic(int n) {
        if(n == 1) {
            return 1;
        }
        else{
            return (1.0 / n) + harmonic(n-1);
        }
    }
}


/******
 * Given a number N. The task is to find the sum of N Harmonic Number. Let the nth harmonic number be Hn. The harmonic series is as follows:
 * H1 = 1
 * H2 = H1 + 1/2
 * H3 = H2 + 1/3
 * H4 = H3 + 1/4
 * . . .
 * Hn = Hn-1 + 1/n
 *
 * Input Format
 * 5
 *
 * Constraints
 * 0
 *
 * Output Format
 * 2.2833
 *
 * Sample Input 0
 * 5
 * Sample Output 0
 * Harmonic sum upto 4 decimal places: 2.2833
 */
