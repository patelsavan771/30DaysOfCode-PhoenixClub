import java.util.Scanner;

public class D8_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 0;
        while(n != 0) {
            if(n % 2 == 1) {
                result++;
            }
            n /= 2;
        }
        System.out.println(result);
    }
}
