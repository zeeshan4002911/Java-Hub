
/**
 * Add two numbers represented by linked lists

Given two numbers represented by two linked lists of size N and M. The task is to return a sum list.

The sum list is a linked list representation of the addition of two sc numbers from the last.
Input Format

The first line inputs N and M ,the size of two linked lists.

The second line inputs the value of N nodes of 1st linked list.

The third line inputs the value of M nodes of 2nd linked list.
Output Format

Print the sum list.
Example 1

Input

2 3
4 5 
3 4 5

Output

3 9 0

Explaination

For the given two linked
list (4 5) and (3 4 5), after adding
the two linked list resultant linked
list will be (3 9 0).

Example 2

Input

3 3
5 4 1 
7 2 5

Output

1 2 6 6 

Explaination

For the given two linked
list (5 4 1) and (7 2 5, after adding
the two linked list resultant linked
list will be (1 2 6 6 ).

Constraints:

1 <= N, M <= 5000

0<= |value of each node| <=9
 */

import java.util.*;

public class AddTwoNumLL {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        Node headm = null, headn = null, head = null;
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < m; i++)
            headm = insertAtFront(headm, sc.nextInt());
        for (int i = 0; i < n; i++)
            headn = insertAtFront(headn, sc.nextInt());
        head = Add(headm, headn);
        printReverse(head);
        sc.close();
    }

    public static Node insertAtFront(Node head, int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
            return head;
        }
        newnode.next = head;
        head = newnode;
        return head;
    }

    static Node Add(Node headm, Node headn) {
        int carry = 0, sum;
        Node head = new Node(0);
        Node curr = head;
        while (headm != null && headn != null) {
            sum = headm.data + headn.data + carry;
            carry = sum / 10;
            sum %= 10;
            Node newnode = new Node(sum);
            curr.next = newnode;
            curr = curr.next;
            headm = headm.next;
            headn = headn.next;

            if (headm == null && headn != null) {
                sum = headn.data + carry;
                carry = sum / 10;
                sum %= 10;
                Node m = new Node(sum);
                curr.next = m;
                curr.next.next = headn.next;
            } else if (headn == null && headm != null) {
                sum = headm.data + carry;
                carry = sum / 10;
                sum %= 10;
                Node m = new Node(sum);
                curr.next = m;
                curr.next.next = headm.next;
            }
            if (headm == null && headn == null && carry > 0) {
                Node n = new Node(carry);
                curr.next = n;
            }
        }
        return head.next;
    }

    static void printReverse(Node head) {
        if (head == null)
            return;
        printReverse(head.next);
        System.out.print(head.data + " ");
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}