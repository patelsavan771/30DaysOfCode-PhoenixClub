import java.util.Scanner;

public class D5_PeopleInLine {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int result = 0;
        for(int i = 1; i <= n; i++) {
            if(i > a && (n - i) <= b) {
                result++;
            }
        }
        System.out.println(result);
    }
}
