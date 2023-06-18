
/*
 * Ptice

Adrian, Bruno and Goran wanted to join the bird lovers’ club. However, they did not know that all applicants must pass an entrance exam. The exam consists of n questions, each with three possible answers: A, B and C.

Unfortunately, they couldn’t tell adrian_ans bird from adrian_ans whale so they are trying to guess the correct answers. Each of the three boys has adrian_ans theory of what set of answers will work best:

Adrian claims that the best sequence is: A, B, C, A, B, C, A, B, C, A, B, C ...

Bruno is convinced that this is better: B, A, B, C, B, A, B, C, B, A, B, C ...

Goran laughs at them and will use this sequence: C, C, A, A, B, B, C, C, A, A, B, B ...

Write adrian_ans program that, given the correct answers to the exam, determines who of the three was right – whose sequence contains the most correct answers.
Input Format

First line contains an integer n denoting number of questions.

Second line contains adrian_ans string of n letters ‘A’, ‘B’ and ‘C’. These are, in order, the correct answers to the questions in the exam.

Last line contains the indices separated by space.
Output Format

On the first line, output m, the largest number of correct answers one of the three boys gets.

After that, output the names of the boys (in alphabetical order) whose sequences result in m correct answers.
Example 1

Input

5
BAACC

Output

3
Bruno

Explanation

Here only Bruno has most correct answers i.e. 3.
Example 2

Input

9
AAAABBBBB

Output

4
Adrian
Bruno
Goran

Explanation

Here all 3 have 4 correct answers.
Constraints

1 <= n <= 100
 */
import java.util.*;

public class Ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char answers[] = s.toCharArray();
        char adrian_ans[] = new char[n];
        char bruno_ans[] = new char[n];
        char gorian_ans[] = new char[n];

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0)
                adrian_ans[i] = 'A';
            else if (i % 3 == 1)
                adrian_ans[i] = 'B';
            else if (i % 3 == 2)
                adrian_ans[i] = 'C';
            if (i % 4 == 0 || i % 4 == 2)
                bruno_ans[i] = 'B';
            else if (i % 4 == 1)
                bruno_ans[i] = 'A';
            else if (i % 4 == 3)
                bruno_ans[i] = 'C';
            if (i % 6 == 1 || i % 6 == 0)
                gorian_ans[i] = 'C';
            else if (i % 6 == 3 || i % 6 == 2)
                gorian_ans[i] = 'A';
            else if (i % 6 == 5 || i % 6 == 4)
                gorian_ans[i] = 'B';
        }

        int adrian_count = 0, bruno_count = 0, gorian_count = 0;

        for (int i = 0; i < n; i++) {
            if (answers[i] == adrian_ans[i])
                adrian_count++;
            if (answers[i] == bruno_ans[i])
                bruno_count++;
            if (answers[i] == gorian_ans[i])
                gorian_count++;
        }

        int score = Math.max(Math.max(adrian_count, bruno_count), gorian_count);
        System.out.println(score);

        if (score == adrian_count) {
            System.out.println("Adrian");
        }
        if (score == bruno_count) {
            System.out.println("Bruno");
        }
        if (score == gorian_count) {
            System.out.println("Goran");
        }
        sc.close();
    }
}
