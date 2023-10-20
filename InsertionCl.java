
/**
 * Insertion in circular linked list

Given a circular linked list consisting of N nodes and an integer K, your task is to add the integer K at the end of the list.
Input Format

The first line contains an integer N, the length of the circular linked list.
The next line contains N integers, the elements of the circular linked list.
The last line contains K, the value of the node to be added to the end of the list.
Output Format

Print the updated circular linked list in the new line.
Example 1

Input

3
1 2 3
4

Output

1 2 3 4

Example 2

Input

4
1 2 3 4
1

Output

1 2 3 4 1

Constraints:

1 <= N <= 1000
1 <= list[i] <= 1000, where list[i] is the ith element of the list.
 */

import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++)
            head = insertAtEnd(head, input.nextInt());
        int k = input.nextInt();
        head = insertAtEnd(head, k);
        print(head);
        input.close();
    }

    public static Node insertAtEnd(Node head, int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            head.next = newnode;
            return head;
        }
        newnode.next = head.next;
        head.next = newnode;
        head = newnode;
        return head;
    }

    public static void print(Node head) {
        Node temp = head.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head.next);
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