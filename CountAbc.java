/**
 * Countabc

Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1

countAbc("abcxxabc") → 2

countAbc("abaxxaba") → 2
Input Format

Only line contains the string in which we have to count "abc" and "aba".
Output Format

Print the number of "abc" and "aba" in string.
Example 1

Input

abcxxabc

Output

2

Explanation

There are 2 abc from 0 -> 2 and from 5 -> 7
Example 2

Input

abaxxaba

Output

2

Explanation

There are 2 aba from 0 -> 2 and from 5 -> 7
Constraints

    1 <= s.size() <= 1000

 */

import java.util.*;

public class CountAbc {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);

        int result = countabc(a, 0, n, 0);
        System.out.println(result);
        sc.close();
    }

    public static int countabc(char a[], int i, int n, int c) {
        if (a[i] == 'a' && a[i + 1] == 'b') {
            if (a[i + 2] == 'c' || a[i + 2] == 'a')
                c++;
        }
        if (i == n - 1) {
            return c;
        }
        int ans = countabc(a, i + 1, n, c);
        return ans;
    }

}