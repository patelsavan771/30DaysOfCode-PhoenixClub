import java.util.Scanner;

public class D10_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int[] f = new int[max + 1];
        for(int i = 0; i < n; i++) {
            f[Math.abs(arr[i])]++;
        }
        int flag = -1;
        for(int i = max; i >= 0; i--) {
            if(f[i] == 2) {
                flag = i;
                break;
            }
        }
        System.out.println(flag);
    }
}
