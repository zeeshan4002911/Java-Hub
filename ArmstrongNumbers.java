/**
 * ArmstrongNumber

Write a program to print out all Armstrong numbers between 1 and N.

A number is called an Armstrong number if the sum of cubes of each digit of the number is equal to the number itself.

For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
Input Format

The input contains a single integer representing N.
Output Format

Print all the Armstrong numbers from 1 to N in separate lines.
Example 1

Input

200

Output

1
153

Explanation

1 and 153 are only Armstrong numbers between 1 to 200.
Example 2

Input

1000

Output

1
153
370
371
407

Explanation

1, 153, 370, 371, 407 are only Armstrong numbers between 1 to 1000.
Constraints

1 <= N <= 10^6
*/

import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            double num = i;
            while(num != 0) {
                double rem = num % 10;
                sum += Math.pow(rem, 3);
                num = Math.floor(num / 10);
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
