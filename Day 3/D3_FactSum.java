import java.util.Scanner;

public class D3_FactSum {
    //1! + 4! + 5! = 1 + 24 + 120 = 145
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int sum = 0;
        while(temp != 0) {
            int digit = temp % 10;
            sum += fact(digit);
            temp /= 10;
        }
//        System.out.println(sum);
        if(sum == n) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
}

/******
 * Phoenix Numbers are the numbers whose sum of factorial of digits is equal to the original number. Given a number, check if it is a Phoenix Number or not. Print Yes or No
 * Sum of digit factorials = 1! + 4! + 5! = 145
 * Sample Input 0
 * 145
 *
 * Sample Output 0
 * Yes
 */
