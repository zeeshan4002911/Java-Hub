/*
 * 
 * PEAK ELEMENT

An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).

For first and last element consider only the element adjacent to it.

Given an array arr of size n, find the index of first peak element.

If peak element does not exist, print -1.
Input Format

First line contains an integer n.

Second line contains n space separated integers.
Output Format

Return the index of the peak element in zero based indexing if present, else return -1
Example 1

Input

4
5 10 20 15

Output

2

Explanation

20 is greater than both of its neighbours. Hence 20 is the peak element, So output is 2
Example 2

Input

7
10 20 15 2 23 64 67

Output

1

Explanation

20 is greater than both of its neighbors. Hence 20 is the peak element, So output is 1
Constraints

    1<=n<=10^6
    1<=arr[i]<=10^6

 */

import java.util.*;

public class PeakElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }

            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (arr[i] > arr[i + 1]) {
                        System.out.print(0);
                        return;
                    }
                } else if (i == arr.length - 1) {
                    if (arr[i] > arr[i - 1]) {
                        System.out.print(arr.length - 1);
                        return;
                    }
                } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.print(i);
                    return;
                }
            }
            System.out.print((-1));
            sc.close();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}