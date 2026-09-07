import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int n = s.length();
            int[] freq = new int[26];

            for (int i = 0; i < n / 2; i++) {
                freq[s.charAt(i) - 'a']++;
            }

            for (int i = (n + 1) / 2; i < n; i++) {
                freq[s.charAt(i) - 'a']--;
            }

            boolean lapindrome = true;

            for (int i = 0; i < 26; i++) {
                if (freq[i] != 0) {
                    lapindrome = false;
                    break;
                }
            }

            System.out.println(lapindrome ? "YES" : "NO");
        }

        sc.close();
    }
}


//  OUTPUT

Sample Input
6
gaga
abcde
rotor
xyzxy
abbaab
ababc


OUTPUT

YES
NO
YES
YES
NO
NO
