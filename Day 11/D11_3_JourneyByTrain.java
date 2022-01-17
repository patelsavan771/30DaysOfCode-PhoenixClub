import java.util.Scanner;

public class D11_3_JourneyByTrain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] bookings = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                bookings[i][j] = s.nextInt();
            }
        }

        int trains = s.nextInt();
        int[] arr = new int[trains];

        for (int i = 0; i < n; i++) {
            for (int j = bookings[i][0]; j <= bookings[i][1]; j++) {
                arr[j - 1] += bookings[i][2];
            }
        }
        for (int i = 0; i < trains; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/****
 * There are n trains that are labeled from 1 to n.
 *
 * You are given an array of train bookings as bookings, where bookings[i] = [first, last, seats] represents a booking for trains from first through last (inclusive) with no of seats seats reserved for each train in the range.
 *
 * Return an array answer of length n, where answer[i] is the total number of seats reserved for train i.
 *
 * Input Format
 *
 * length of bookings = 3,
 *
 * bookings = [[1,2,10],[2,3,20],[2,5,25]],
 *
 * no of trains = 5
 *
 * Constraints
 *
 * 1 <= n <= 2 * 104
 * 1 <= bookings.length <= 2 * 104
 * bookings[i].length == 3
 * 1 <= firsti <= lasti <= n
 * 1 <= seatsi <= 104
 * Output Format
 *
 * 10 55 45 25 25
 *
 * Sample Input 0
 *
 * 3
 * 1 2 10
 * 2 3 20
 * 2 5 25
 * 5
 * Sample Output 0
 *
 * 10 55 45 25 25
 * Explanation 0
 *
 * image
 *
 * Sample Input 1
 *
 * 2
 * 1 2 10
 * 2 2 15
 * 2
 * Sample Output 1
 *
 * 10 25
 * Explanation 1
 *
 * image
 *
 * Sample Input 2
 *
 * 4
 * 1 3 10
 * 2 6 20
 * 3 5 30
 * 2 5 10
 * 6
 * Sample Output 2
 *
 * 10 40 70 60 60 20
 */
