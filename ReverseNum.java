
/**
 * Reverse digits of a Number

Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.

For example, if the input is 12345, the output should be 54321.

Note: Input number will not have any trailing zeros.
Input Format

The first line of input contains the integer n.
Output Format

The output should be the reverse of n.
Example 1

Input

12345

Output:

54321

Example 2

Input

143323

Output

323341

Constraints

1 <= n <= 10^9

n will not have any trailing zeros.
 */
import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextInt();
        double result = 0;
        while (num != 0) {
            double rem = num % 10;
            result = 10 * result + rem;
            num = Math.floor(num / 10);
        }
        int ans = (int) result;
        System.out.println(ans);
        sc.close();
    }
}
