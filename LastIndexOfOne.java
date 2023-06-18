
/**
 * Last index of One

Given a string S consisting only 0s and 1s, find the last index of the 1 present in it.
Input Format

The only line contains a string S.
Output Format

Print the last index of 1. If 1 is not present in the string, print -1
Example 1

Input

00001

Output

4

Explanation 1

Last index of 1 is 4
Example 2

Input

00000

Output

-1

Explanation 2

No 1 is present in the string.
Constraints

1 <= |S| <= 10^6

S = {0,1}
 */
import java.util.*;

public class LastIndexOfOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Boolean flag = false;
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == '1') {
                System.out.println(i);
                flag = true;
            }
        }
        if (!flag)
            System.out.print(-1);
        sc.close();
    }
}
