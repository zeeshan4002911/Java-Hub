
/**
 * Add 1 to a number represented as linked list

Given a number N, you have to represent it in Linked List such that each digit corresponds to a node in linked list.

After forming the linked list, you have to add 1 to the number and then print the updated linked list.
Input Format

The only line inputs N, an integer.
Output Format

Print the updated linked list in a new line.
Example 1

Input

456

Output

4 5 7

Explanation

The number is represented in the linked list as 4 -> 5 -> 7.
Example 2

Input

25

Output

2 5

Explanation

The number is represented in the linked list as 2 -> 5 .
Constraints

1 ≤ N < 10^9
Topic Tags
Companies

 */

import java.util.*;

public class AddToLinkedList {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        n = n + 1;
        Node head = null;
        for (int i = n; i > 0; i /= 10)
            head = insertAtFront(head, i);
        print(head);
    }

    public static Node insertAtFront(Node head, int n) {
        Node newnode = new Node(n % 10);
        if (head == null) {
            head = newnode;
            return head;
        }
        newnode.next = head;
        head = newnode;
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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