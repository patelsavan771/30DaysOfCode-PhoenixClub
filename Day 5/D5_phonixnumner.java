import java.util.Scanner;

public class D5_phonixnumner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int last = n % 10;
        int last2 = ((int)Math.pow(n,2)) % 10;
        if(last == last2) {
            System.out.println("Phoenix number");
        }
        else{
            System.out.println("Not a phoenix number.");
        }

    }
}
