import java.util.Scanner;

public class D6_LargestProd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int max = arr[0] * arr[1];

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(max < arr[i] * arr[j]) {
                    max = arr[i] * arr[j];
                }
            }
        }



        System.out.println(max);

    }
}
