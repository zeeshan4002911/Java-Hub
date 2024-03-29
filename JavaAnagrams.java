
/**
 * Two strings, and

, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

    string a: the first string
    string b: the second string

Returns

    boolean: If 

and

    are case-insensitive anagrams, return true. Otherwise, return false.

Input Format

The first line contains a string
.
The second line contains a string

.

Constraints

Strings and

    consist of English alphabetic characters.
    The comparison should NOT be case sensitive.

Sample Input 0

anagram
margana

Sample Output 0

Anagrams

Explanation 0
Character 	Frequency: anagram 	Frequency: margana
A or a 	3 	3
G or g 	1 	1
N or n 	1 	1
M or m 	1 	1
R or r 	1 	1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa

Sample Output 1

Not Anagrams

Explanation 1
Character 	Frequency: anagramm 	Frequency: marganaa
A or a 	3 	4
G or g 	1 	1
N or n 	1 	1
M or m 	2 	1
R or r 	1 	1

The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello

Sample Output 2

Anagrams

Explanation 2
Character 	Frequency: Hello 	Frequency: hello
E or e 	1 	1
H or h 	1 	1
L or l 	2 	2
O or o 	1 	1

The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
 */

import java.util.*;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        // char[] a_arr = a.toCharArray();
        // char[] b_arr = b.toCharArray();
        // Arrays.sort(a_arr);
        // Arrays.sort(b_arr);
        // a = new String(a_arr);
        // b = new String(b_arr);
        // return a.compareTo(b) == 0 ? true : false;

        // Without using any Library
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() == b.length())

        {
            int[] a_arr = new int[256];
            int[] b_arr = new int[256];
            for (int i = 0; i < a.length(); i++) {
                a_arr[(int) a.charAt(i)] += 1;
                b_arr[(int) b.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (a_arr[i] != b_arr[i])
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}