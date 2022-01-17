import java.util.Scanner;

public class D6_SummingOfNeighbors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];


        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n - 4; i++) {
            int sum = 0;
            for(int j = i; j < i + 4; j++) {
                sum += arr[j];
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}

/*
n = 10
k = 4
arr[] = 1, 4, 2, 10, 23, 3, 1, 0, 20
 */