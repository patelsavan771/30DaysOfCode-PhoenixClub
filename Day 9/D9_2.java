import java.util.Scanner;

public class D9_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int[] f = new int[max + 1];
        for (int i = 0; i < n; i++) {
            f[arr[i]]++;
        }
        boolean flag = false;
        for(int i = 1; i < f.length; i++) {
            if(f[i] == i) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
