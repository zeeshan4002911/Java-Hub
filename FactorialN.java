
/**
 * Factorial of a Number

Given a positive integer N, find its factorial.
Input Format

Input consists of a single integer N
Output Format

Print the factorial of the number.
Example 1

Input

5

Output

120

Explanation

We have N = 5.

So Factorial of 5 = 1 * 2 * 3 * 4 * 5 = 120
Example 2

Input

15

Output

1307674368000

Explanation

We have N = 15.

So Factorial of 15 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 = 1307674368000
Constraints

1 <= N <= 18
 */
import java.util.*;

public class FactorialN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long result = fact(n);
        System.out.println(result);
        sc.close();
    }

    public static long fact(int a) {
        if (a == 1)
            return 1;
        return a * fact(a - 1);
    }
}
