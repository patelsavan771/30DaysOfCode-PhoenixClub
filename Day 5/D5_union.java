import java.util.HashSet;
import java.util.Scanner;

public class D5_union {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        HashSet<Integer> union = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int temp = s.nextInt();
            union.add(temp);
        }
        for(int i = 0; i < m; i++) {
            int temp = s.nextInt();
            union.add(temp);
        }
        System.out.println(union.size());
    }
}
