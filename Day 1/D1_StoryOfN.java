import java.util.Scanner;

public class D1_StoryOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int num = 29;
        int n = input.nextInt();
        while( i != n) {
            if(sumOfDigits(num) == 11) {
                i++;
            }
            num++;
        }
        System.out.println(--num);
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}


/*******
 * Raam is superstitious. He will only use a particular digit of number as a roll number if its sum of digits is 11. Find those numbers having sum 11.
 * Here, find the Nth number having sum 11. So, in short: Given an integer value n, find out the n-th positive integer whose sum is 11.
 *
 * Input Format
 * 2
 *
 * Constraints
 * 0 < n < 50
 *
 * Output Format
 * 38
 *
 * Sample Input 0
 * 3
 * Sample Output 0
 * 47
 */