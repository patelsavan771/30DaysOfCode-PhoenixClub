import java.util.Scanner;

public class D3_CountSpecialNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int comp = n / k;
        int result = 0;
        int[] count = new int[104];
        for(int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for(int i = 0; i < n; i++) {
            int ele = input.nextInt();
            count[ele]++;
        }
        for(int i = 0; i < count.length; i++) {
            if(count[i] == comp) {
                result++;
            }
        }
        System.out.println(result);
    }
}


/******
 * The task is to count the number of elements that occurs exactly floor(N/K) times in the array.
 * Input:
 * 5 2
 * 1 4 1 2 4
 * Output:
 * 2
 * Explanation:
 * In the given array, 1 and 4 occurs floor(5/2) = 2 times. So count is 2.
 *
 * First line contains 2 integers N and K seperated by spaces. Second line contains N array elements seperated by spaces.
 *
 * Input Format
 *
 * 5 2
 * 1 4 1 2 4
 *
 * Constraints
 * 1 <= N <= 103 1 <= Ai <= 103
 *
 * Output Format
 * 2
 * Sample Input 0
 * 5 2
 * 1 4 1 2 4
 * Sample Output 0
 * 2
 */
