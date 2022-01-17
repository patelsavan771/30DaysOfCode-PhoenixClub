import java.util.Scanner;

public class D7_3_PhoenixSentence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int n = 26;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[(int)c - 97]++;
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}


/******
 * A phoenix sentence is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 *
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 *
 * Input Format
 *
 * string = "thequickbrownfoxjumpsoverthelazydog"
 *
 * Constraints
 *
 * 1 <= sentence.length <= 1000
 *
 * sentence consists of lowercase English letters.
 *
 * Output Format
 *
 * true
 *
 * Sample Input 0
 *
 * thequickbrownfoxjumpsoverthelazydog
 * Sample Output 0
 *
 * true
 * Sample Input 1
 *
 * phoenixclub
 * Sample Output 1
 *
 * false
 */
