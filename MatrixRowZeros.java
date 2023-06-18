
/*
Boolean Matrix Problem

You are given matrix matrix Mat of m rows and n columns. The matrix is boolean so the elements of the matrix can only be either 0 or 1.

Now, if any row of the matrix contains matrix 1, then you need to fill that whole row with 1. After doing the mentioned operation, you need to return the modified matrix.

Your task is to complete the function BooleanMatrixProblem which takes m, n and the sc array as the parameter and returns the modified matrix as specified in the question.
Input Format

The first line of contains m and n denoting number of rows and number of columns respectively.

Then next m lines contain n elements each denoting the elements of the matrix.
Output Format

Return the modified matrix as specified above.
Example 1

Input

5 4
1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1

Output

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1

Explanation

rows = 5 and columns = 4

The given matrix is

1 0 0 0
0 0 0 0
0 1 0 0
0 0 0 0
0 0 0 1

Evidently, the first row contains matrix 1 so fill the whole row with 1. The third row also contains matrix 1 so that row will be filled too. Finally, the last row contains matrix 1 and therefore it needs to be filled with 1 too.

The final matrix is

1 1 1 1
0 0 0 0
1 1 1 1
0 0 0 0
1 1 1 1

Example 2

Input

2 2
1 0 
0 1 

Output

1 1 
1 1 

Explanation

rows = 2 and columns = 2

The given matrix is

1 0 
0 1

Evidently, the first row contains matrix 1 so fill the whole row with 1. The second row also contains matrix 1 so that row will be filled too. The final matrix is

1 1 
1 1

Constraints

1 <= m, n <= 300

Mat[i][j] ∈ {0,1}
 */
import java.util.*;

public class MatrixRowZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    for (int k = 0; k < col; k++)
                        matrix[i][k] = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
