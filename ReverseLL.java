
/**
 * Print in Reverse

Given an integer n denoting number of elements in linked list. And then we are given n integers where the ith integer denoted ith element of linked list. We need to print the linked list in reverse i.e from tail to head.

Your task is to complete the function reverse which receives the head of the linked list as parameter and prints the linked list in reverse order.
Input Format

The First line of input contains a single integer n denoting size of linked list The Second line contains n integers where ith integer denotes ith element of linked list
Output Format

Ouput linked list in reverse order i.e from last node(tail) to head node
Example 1

Input

5
2 6 8 10 1

Output:

1 10 8 6 2

Example 2

Input

6
1 2 3 4 5 6

Output:

6 5 4 3 2 1

Constraints:

1 <= n <= 5*10^3
 */

import java.util.*;

public class ReverseLL {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            list.add(x);
        }
        reverse(list.head);
        System.out.println("");
        input.close();
    }

    public static void reverse(Node curr) {
        // write code here
        Node prev = null;
        Node current = curr;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        curr = prev;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}