/*
 * 
 * Which angled triangle

Given the 3 sides of a triangle, find out whether it is acute-angled, right-angled, or obtuse-angled.

You need to output 1 for acute, 2 for right-angled, and 3 for an obtuse-angled triangle. You can assume that the input values always form a triangle and are valid integers.

Note:

A triangle is acute-angled, if the square of the largest side is less than the sum of squares of other two sides.

A triangle is obtuse-angled, if the square of its largest side is greater than the sum of squares of other two sides.

A triangle is right-angled, if the square of its largest side is exactly equal to the sum of squares of other two sides.
Input Format

Line would contain 3 integers which are sides of the triangle.
Output Format

Return 1 if it is a acute-angled triangle, 2 if it is a right angled triangle and 3 if it is a obtuse-angled triangle.
Example 1

Input

3 4 5

Output

2

Explanation

Since 5x5 is equal to 3x3 + 4x4, So this is a right-angled triangle and hence, the answer is 2.
Example 2

Input

3 3 3

Output

1

Explanation

Since 3x3 is less than 3x3 + 3x3, So this is an acute-angled triangle and hence, the answer is 1.
Constraints

`1 <= n <= 10 ^ 4

Sum of two sides is always less than the third side.
 */

import java.util.*;

public class TriangleIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;

        if (a >= b && a >= c) {
            result = identifier(a, b, c);
        } else if (b >= c) {
            result = identifier(b, a, c);
        } else {
            result = identifier(c, a, b);
        }
        System.out.print(result);
        sc.close();
    }

    public static int identifier(int a, int b, int c) {
        int expression1 = a * a;
        int expression2 = (b * b + c * c);

        if (expression1 < expression2)
            return 1;
        if (expression1 == expression2)
            return 2;
        if (expression1 > expression2)
            return 3;
        return 0;
    }
}