
/**
 * Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, print[-1, -1].

You must write an algorithm with O(log n) runtime complexity.
Input Format

The first line contains two integers n (number of elements in the array) and target.

The second line contains n integers (value of elements in the array).
Output Format

Print two space separated integers denoting the first and last index of target.
Example 1

Input

 6 8
 5 7 7 8 8 10

Output

 3 4

Explanation

8 occurs for the first time at index 3 and at index 4 for the last time.
Example 2

Input

 6 6
 5 7 7 8 8 10

Output

 -1 -1

Explanation

6 doesn't occur in the given array, hence we return -1 -1
Constraints

0 <= nums.length <= 10^5

-10^9 <= nums[i] <= 10^9

nums is a non-decreasing array.

-10^9 <= target <= 10^9
 */
import java.util.*;

public class SortedFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[n];
        int start = -1, end = -1, count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == key && count == 0) {
                start = i;
                count++;
            } else if (arr[i] == key) {
                end = i;
            }
        }
        System.out.println(start + " " + end);
        sc.close();
    }
}
