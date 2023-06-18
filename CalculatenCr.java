
/**
 * Calculate nCr

Given n and r, your task is to calculate nCr.

Here nCr is the total number of ways for selecting r elements out of n options are nCr = (n!) / (r! * (n-r)!) where n! = 1 * 2 * . . . * n.
Input Format

Input consists of one line having two integers n followed by r.
Output Format

We have to calculate nCr using the formula as given in the question.
Example 1

Input

5 2

Output

10

Example 2

Input

3 1

Output

3

Constraints

1 <= n <= r <= 20
 */
import java.util.*;

public class CalculatenCr {
    public static long fact(long i) {
        if (i == 1)
            return 1;
        return i * fact(i - 1);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();
        long ncr = fact(n) / (fact(r) * fact(n - r));
        System.out.print(ncr);
        sc.close();
    }
}
