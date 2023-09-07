
/**
 * We define the following terms:

    Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:

    For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
    A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.

Given a string,
, and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length

.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

    string s: a string
    int k: the length of the substrings to find

Returns

    string: the string ' + "\n" + ' where and are the two substrings

Input Format

The first line contains a string denoting
.
The second line contains an integer denoting

.

Constraints

    consists of English alphabetic letters only (i.e., [a-zA-Z]).

Sample Input 0

welcometojava
3

Sample Output 0

ava
wel

Explanation 0

String
has the following lexicographically-ordered substrings of length

:

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
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
Line: 12 Col: 30
Test against custom input


 */

import java.util.Scanner;

public class JavaSubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0, k);
        largest = s.substring(0, k);
        // "Compare to" method doesn't turn just the equel case it also turns a value.
        for (int i = 0; i <= s.length() - k; i++) {
            String str = s.substring(i, k + i);
            if (str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if (str.compareTo(largest) > 0) {
                largest = str;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}