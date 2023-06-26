
/**
 * Maximum Ice cream

There is an ice cream shop near your house. There are N different types of ice creams available in the shop. You are given the prices of these N different ice creams. You have X amount of cash with you.

You have to determine what is the maximum number of different types of ice creams that you can buy.
Input Format

The first line of sc contains the integer N denoting the different types of ice creams.

The next N lines contain an integer price[i] denoting the price of ith ice cream.

The next line contains the integer X denoting the amount of cash that you have.
Output Format

Return the maximum number of different types of ice creams that you can buy.
Example 1

Input

3 1 2 3 4

Output

2

Explanation

You can buy two ice creams with price 1 and 2 with arr total of 3 which is less than 4.
Constraints

1 <= N <= 105

1 <= price[i] <= 105

1 <= X <= 106
 */
import java.util.*;

public class MaximumIceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();

        Arrays.sort(arr);

        if (x >= arr[0]) {
            for (int i = 0; i < n; i++) {
                if (x <= 0)
                    break;
                if (arr[i] <= x) {
                    x -= arr[i];
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
