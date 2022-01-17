import java.util.Scanner;

public class D9_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n_sum = sum(n);
        while(n_sum > 9) {
            n_sum = sum(n_sum);
        }

        System.out.println(n_sum);
    }

    public static int sum(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
