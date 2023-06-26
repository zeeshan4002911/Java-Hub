
/**
 * Find Character

Given a string S of N characters and a character C, find the position of that character in that string. If there are multiple occurrences, return the first occurrence from the left.

The string is 1-index based and you need to return the index of the position of the matching character.

If the character is not present, return -1.
Input Format

The first line of the sc contains the integer N.

The second line contains the string S.

The third line contains the character C.
Output Format

Return the index of the matching character (1 based indexing). If not present, return -1.
Example 1

Input

4
dhwe
w

Output

3

Explanation In string dhwe, the position of the characters is d=1, h=2, w=3 and e=4. So the position of w will be `3.
Example 2

Input

4
abde
w

Output

-1

Explanation The character w is not present in the string abde, hence we return -1.
Constraints

1 <= N <= 10^5

S only contains lowercase letters.
 */
import java.util.*;

public class FindCharachter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char c = sc.next().charAt(0);
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == c) {
                ans = i + 1;
                break;
            }
        }
        System.out.print(ans);
        sc.close();
    }
}
