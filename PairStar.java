
/**
 * PairStar

Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input Format

The first line contains the string.
Output Format

Return the desired output string where there is a * between consecutive same characters.
Example 1

Input

hello

Output

hel*lo

Example 2

Input

xxyy

Output

x*xy*y

Constraints

1 <= s.size() <= 1000
 */
import java.util.*;

public class PairStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        int n = arr.length;
        rec(0, arr, n);
        sc.close();
    }

    public static void rec(int i, String[] arr, int n) {
        if (i == n)
            return;
        if (i != 0 && arr[i - 1].equals(arr[i])) {
            System.out.print("*");
        }
        System.out.print(arr[i]);
        rec(i + 1, arr, n);
        return;
    }
}
