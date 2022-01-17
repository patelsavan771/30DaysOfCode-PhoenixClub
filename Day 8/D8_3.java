import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D8_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[] nums = new int[n];
        int[] index = new int[m];
        List<Integer> target = new ArrayList<Integer>();


        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            index[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++) {
            target.add(index[i], nums[i]);
        }

        for(int i : target) {
            System.out.print(i + " ");
        }
    }
}
