
/**
 * Delete a Node

Given a linked list and an index, write a function to delete the node at that index from the linked list.
Input Format

The first line of input contains an integer n, the number of elements in the linked list.

Each of the next n lines contains an integer, the node data values in order.

The last line contains an integer, the index of the node to delete. (0 <= position <= n-1)
Output Format

Output elements of the linked list after deleting the required node
Example 1

Input

8
20
6
2
19
7
4
15
9
3

Output

20 6 2 7 4 15 9

Explanation

After deleting the element at index 3 (with value 19), we obtain the linked list 20 -> 6 -> 2 -> 7 -> 4 -> 15 -> 9.
Example 2

Input

3
1
2
3
0

Output

2 3

Constraints

1 <= n <= 1000

1 <= llist[i] <= 1000, where llist[i] is the ith element of linked list
 */

import java.util.*;

public class DeleteNodeLL {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner input = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                head = insertAtEnd(head, input.nextInt());
                tail = head;
            } else {
                tail = insertAtEnd(tail, input.nextInt());
            }
        }
        int index = input.nextInt();
        head = deleteNode(head, index);
        print(head);
        input.close();
    }

    public static Node insertAtEnd(Node tail, int data) {
        Node newnode = new Node(data);
        if (tail == null) {
            tail = newnode;
            return tail;
        }
        tail.next = newnode;
        return newnode;
    }

    public static Node deleteNode(Node head, int index) {
        int count = 0;
        if (index == 0)
            return head.next;
        Node temp = head;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
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
