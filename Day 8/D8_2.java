import java.util.Scanner;

public class D8_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int profit = 0;
        for (int i = 0; i < n - 1; i++) {
            int temp = minn(arr, i , n - 1);
            if(profit < temp) {
                profit = temp;
            }
        }
        System.out.println(profit);
    }
    public static int minn(int[] arr,int l, int h) {
        int max = arr[l];
        for(int i = l + 1; i <= h; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max - arr[l];
    }
}
