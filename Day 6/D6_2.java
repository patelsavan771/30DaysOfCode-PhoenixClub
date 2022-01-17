import java.util.Scanner;

public class D6_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] arr1 = new int[n];


        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(i != j && arr[j] < arr[i]) {
                    count++;
                }
            }
            arr1[i] = count;
        }


        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
