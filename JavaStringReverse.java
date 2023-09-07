
/**
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string

, print Yes if it is a palindrome, print No otherwise.

Constraints

will consist at most

    lower case english letters.

Sample Input

madam

Sample Output

Yes

*/

import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        // Two pointers method
        // for (int i = 0, j = A.length() - 1; i < j; i++, j--) {
        // if (A.charAt(i) != A.charAt(j)) {
        // System.out.println("No");
        // return;
        // }
        // }
        // System.out.println("Yes");

        // String reverse
        StringBuilder BString = (new StringBuilder(A)).reverse();
        String B = BString.toString();
        if (A.compareTo(B) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
