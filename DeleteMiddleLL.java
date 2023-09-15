
/**
 * Delete the Middle of the Linked List

Given a singly linked list, delete the middle node of the linked list. If there are even nodes, then there would be two middle nodes. We need to delete the second middle element.

After deleting the node, return the head of the linked list.

In the case of a single node, print the head of a linked list containing only one node, which has a value of -1.

You need to complete the given function with the pointer to the head of the linked list.
Input Format

The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the number of nodes in the linked list.

The second line contains N space-separated integers denoting elements of the linked list.
Output Format

For each test case, return the head of the modified, linked list.
Example 1

Input

1
4
1 2 3 4

Output

1 2 4

Explanation

The Initial Linked List looks like this:

1 -> 2 -> 3 -> 4

There are two middle nodes, 2 and 3.

The second middle node gets deleted, i.e., 3 is deleted.

The Linked List after the operation looks like this:

1 -> 2 -> 4

Example 2

Input

1
5
1 3 5 2 6

Output

1 3 2 6

Explanation

The Initial Linked List looks like this:

1 -> 3 -> 5 -> 2 -> 6

There is only one middle node, 5, which gets deleted.

The Linked List after the operation looks like this:

1 -> 3 -> 2 -> 6

Constraints

1 <= T <= 10

1 <= N <= 10000

1 <= L[i] <= 100000
 */

import java.util.*;

public class DeleteMiddleLL {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            int mid = n / 2;
            head = deleteNode(head, mid);
            print(head);
            t--;
        }
        sc.close();
    }

    static Node deleteNode(Node head, int mid) {
        if (head == null || head.next == null) {
            head = null;
            return head;
        }
        int count = 1;
        Node temp = head;
        while (count != mid) {
            count++;
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
        return head;
    }

    static void print(Node head) {
        if (head == null) {
            System.out.print("-1");
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        return;
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
