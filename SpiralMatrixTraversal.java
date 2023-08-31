
/**
 * Spirally traversing a matrix

Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.
Input Format

Input consists of two lines

The first line contains two integers r and c which denotes number of rows and columns respectively.

The next r lines contains c spaced integers, which are the elements of the matrix.
Output Format

Print the spiral matrix.
Example 1

Input

4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

Output

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

Explanation:

We iterate spirally and print each element.
Example 2

Input

3 4  
1 2 3 4
5 6 7 8
9 10 11 12

Output

1 2 3 4 8 12 11 10 9 5 6 7

Explanation:

We iterate spirally and print each element.
Constraints

1 <= r, c <= 100

0 <= matrix[i][j] <= 100
 */

import java.util.*;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int n = row * col;
        for (int i = 0; i < n; i++) {
            // todo
        }

        sc.close();
    }
}
