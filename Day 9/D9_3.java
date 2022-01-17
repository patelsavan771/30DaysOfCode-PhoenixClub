import java.util.Scanner;

public class D9_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            temp += arr[i];
            max = temp > max ? temp : max;
        }
        System.out.println(max);
    }
}
