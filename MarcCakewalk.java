
/**
 * Marc's Cakewalk

Marc loves cupcakes, but he also likes to stay fit. Each cupcake has a calorie count, and Marc can walk a distance to burn those calories.

On eating the jth cupcake with c calories, he must walk at least (2^j)*c miles to maintain his weight.

For example, let calorie=[5,10,7]

If he eats the cupcakes in the order shown, the miles he will need to walk are (20.5)+(21.10)+(22.7)=5+20+28=53. This is not the minimum, though, so we need to test other orders of consumption.

In this case, our minimum miles is calculated as (20.10)+(21.7)+(22.5)=10+14+20=44.

Given the individual calorie counts for each of the cupcakes, determine the minimum number of miles Marc must walk to maintain his weight.

Note that he can eat the cupcakes in any order.
Input Format

The first line contains an integer n, the number of cupcakes.

The next line inputs the calories of n cupcakes.
Output Format

Print the minimum miles necessary.
Example1

Input

3
1 3 2

Output

11

Explanation

Let us say the number of miles Marc must walk to maintain his weight is miles. 
He can minimize miles by eating the n=3 cupcakes in the following order:

Eat the cupcake with c₂=3 calories, so miles=0+(3.2⁰)=3.
Eat the cupcake with c₁=2 calories, so miles=3+(2.2¹)=7.
Eat the cupcake with c₀=1 calories, so miles=7+(1.2²)=11.
We then print the final value of miles, which is 11, as our answer.

Constraints

1 <= n <= 40
1 <= c[i] <= 1000
 */
import java.util.*;
public class MarcCakewalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++)
            c[i] = sc.nextInt();
        long miles_to_walk = 0;

        // Sorting the array in descending order for lowest miles
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i] < c[j]) {
                    int t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            miles_to_walk += (Math.pow(2, i) * c[i]);
        }
        System.out.print(miles_to_walk);
        sc.close();
    }
}
