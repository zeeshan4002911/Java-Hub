
/**
 * No X

Given a string, compute recursively a new string where all the x chars have been removed.
Input Format

Only line contains the string S.
Output Format

Print the string with no x.
Example 1

Input

xaaax

Output

aaa

Explanation

Remove the x at the start and the end.
Example 2

Input

xaxb

Output

ab

Explanation

Remove the x at 0th and 2nd position.
Example 3

Input

xxx

Output

Explanation

Remove all the x so the string becomes empty.
Constraints

1 <= s.length() <= 10 ^ 4
 */
import java.util.*;

public class NoX {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        nox(s, 0, s.length());
        sc.close();
    }

    public static void nox(String s, int i, int n) {
        if (i == n)
            return;
        if (s.charAt(i) != 'x') {
            System.out.print(s.charAt(i));
        }
        nox(s, i + 1, n);
    }
}
