
/**
 * Recursive Digit Sum

Given an integer, we need to find the super digit of the integer n which is concatenated k times.

We define super digit of an integer n using the following rules:

    If n has only 1 digit, then its super digit is n.

    Otherwise, the super digit of n is equal to the super digit of the sum of the digits of n.

Input Format

The first line contains two space separated integers, n and k.
Output Format

In a new line, print the the super digit of n repeated k times.
Example 1

Input:

148 1

Output:

4

Explanation:

Here n=148 and k=1 , so p=148

super_digit(p) = super_digit(148) 
               = super_digit(1+4+8)
               = super_digit(13)
               = super_digit(1+3)
               = super_digit(4)
               = 4

Example 2

Input:

148 3

Output:

3

Explanation:

Here n=148 and k=3 , so p=148148148.

super_digit(p) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3

Constraints:

1 <= |digits in n| <= 25

1 <= k <= 50

 */
import java.util.*;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        String str = "";
        for (int i = 0; i < k; i++) {
            str += n;
        }
        long result = digisum(str);
        System.out.println(result);
        sc.close();
    }

    public static long digisum(String p) {
        if (p.length() <= 1)
            return Long.parseLong(p);

        long sum = 0;
        for (int i = 0; i < p.length(); i++) {
            sum += p.charAt(i) - '0';
        }
        return digisum(String.valueOf(sum));
    }
}
