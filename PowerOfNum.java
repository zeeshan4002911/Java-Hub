/**
 * Power of a Number

Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java or C++ built-in method)
Input Format

The first line will contain two numbers a and b
Output Format

In the output you need to print an integer denoting a raise to power b
Example 1

Input

5 3

Output

125

Explanation

5^3=555=125
Example 2

Input

7 2

Output

49

Explanation

7^2=7*7=49
Constraints

1 <= a, b <= 15
 */
import java.util.*;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.print(result);
        sc.close();        
    }
}
