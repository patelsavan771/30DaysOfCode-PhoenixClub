/****
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 *
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n(number of flowers to b planted), return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output:
 * true
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: false
 * Input Format
 * 5
 * 1 0 0 0 1
 * 2
 *
 * Constraints
 * 1 <= flowerbed.length <= 2 * 104
 * flowerbed[i] is 0 or 1.
 * There are no two adjacent flowers in flowerbed.
 * 0 <= n <= flowerbed.length
 * Output Format
 * false
 *
 * Sample Input 0
 *
 * 5
 * 1 0 0 0 1
 * 1
 * Sample Output 0
 * true
 * Sample Input 1
 * 5
 * 1 0 0 0 1
 * 2
 * Sample Output 1
 * false
 */

import java.util.Scanner;

public class D13_3_FloweringTheYard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();

        int count = 0;
        if(arr[0] == 0 && arr[1] == 0) {
            count++;
            arr[0] = 1;
        }
        for(int i = 1; i < n - 1; i++) {
            if(arr[i - 1] == 0 && arr[i + 1] ==0) {
                count++;
                arr[i] = 1;
            }
        }

        if(arr[n - 1] == 0 && arr[n - 2] == 0) {
            count++;
            arr[n - 1] = 1;
        }

        if(count >= x) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
