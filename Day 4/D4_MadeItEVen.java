import java.util.Scanner;

public class D4_MadeItEVen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    int result = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            if(digits(arr[i]) % 2 == 0) {
                result++;
            }
        }
        System.out.println(result);
    }

    public static int digits(int n) {
        int result = 0;
        while(n != 0) {
            result++;
            n /= 10;
        }
        return result;
    }
}
