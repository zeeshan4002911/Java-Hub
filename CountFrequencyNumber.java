
/**
 * CountFrequencyNumber

Given a number N and a digit D. Write a program to find how many times the digit D appears in the number N.
Input Format

A single line containing the integers N and D.
Output Format

Return a single integer representing the number of times the digit D appears in the number N.
Example 1

Input

1111221 1

Output

5

Explanation

1 occur 5 times in 1111221.
Example 2

Input

554 4

Output

1

Explanation

4 occur 1 time in 554.
Constraints

1 <= |n| <= 10^9

1 <= |d| <= 9
 */

import java.util.*;

public class CountFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        char str[] = s.toCharArray();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (t == str[i])
                count++;
        }
        System.out.print(count);
        sc.close();
    }
}
