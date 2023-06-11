
/**
 * Sorted Insert Position

Given a sorted array A and a target value B, return the index if the target is found. If not, print the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
Input Format

The first line of input contains an integer n.

The second line of input contains n space-separated integers, each a value of A[i].

The third line of input contains target value B.
Output Format

Print the index where the element is present. If it's not present, print the index it would be inserted into the sorted array.
Example 1

Input

4
1 3 5 6 
5

Output

2

Explanation

5 is found at index 2
Example 2

Input

4
1 3 5 6
2

Output

1

Explanation

2 will be inserted at index 1.
Constraints

1 <= N <= 100000

1 <= A[i] <= 10^9

1 <= B <= 10^9
 */
import java.util.*;

public class SortedArrPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= b) {
                System.out.println(i);
                sc.close();
                return;
            }
        }
        sc.close();
    }
}
