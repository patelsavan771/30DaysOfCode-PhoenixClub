import java.util.Scanner;

public class D4_TripletSumToZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) {
                        flag = true;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
    }
}
