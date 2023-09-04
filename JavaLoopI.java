/*
 * Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer,
, print its first multiples. Each multiple (where

) should be printed on a new line in the form: N x i = result.

Input Format

A single integer,

.

Constraints

Output Format

Print
lines of output; each line (where ) contains the of

in the form:
N x i = result.

Sample Input

2

Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

Language
Java 7
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
23
18
19
21
22
24
20
25
Line: 21 Col: 64
Test against custom input
Java
You have earned 10.00 points!
You are now 2 points away from the 2nd star for your java badge.
92%48/50
Congratulations
You solved this challenge. Would you like to challenge your friends?
Compiler Message

Success

Input (stdin)

    2

Expected Output

    2 x 1 = 2

    2 x 2 = 4

    2 x 3 = 6

    2 x 4 = 8

    2 x 5 = 10

    2 x 6 = 12

    2 x 7 = 14

    2 x 8 = 16

    2 x 9 = 18

    2 x 10 = 20


 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaLoopI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
