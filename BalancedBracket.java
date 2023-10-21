
/**
 * Balanced Brackets

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is Balanced if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Input Format

The first line contains a single integer n(Length of the string)

The second line contains string s
Output Format

Print YES is brackets are balanced otherwise print NO
Example 1

Input

2
()

Output

YES

Explanation As ( was closed with ) therefore output isYES
Example 2

Input

2
(]

Output

NO

Explanation The bracket ( was not closed, Therefore output is NO
Constraints

1 <= s.length <= 10^6
s consists of parentheses only '()[]{}'

 */

import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
        sc.close();
    }
}

class Solution {
    public void balancedBrackets(String s, int n) {
        // write code here
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.empty())
                st.push(s.charAt(i));
            else {
                if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                    st.push(s.charAt(i));
                else {
                    if (st.peek() == '[' && s.charAt(i) == ']')
                        st.pop();
                    else if (st.peek() == '{' && s.charAt(i) == '}')
                        st.pop();
                    else if (st.peek() == '(' && s.charAt(i) == ')')
                        st.pop();
                    else {
                        break;
                    }
                }
            }
        }
        if (st.empty())
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}