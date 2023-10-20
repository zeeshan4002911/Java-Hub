
/**
 * Insert node in a doubly linked list

You are given a Doubly linked list and an integer K where every node in the linked list contains two pointers next and prev which point to the next node and previous node in the list respectively. Your task is to insert the integer K at the head of the given linked list.

You have to complete insertAtHead function which contains head node and integer K i.e. value to be added as inputs and you have to return new linkedlist formed after adding node
Input Format

The first line contains an integer N and K.

The next line contains N integers, the elements of the Doubly linked list.
Output Format

Print the updated Doubly linked list in new line.
Example 1

Input

5 2
1 2 3 4 5

Output

2 1 2 3 4 5

Explanation

The initial linked list is 1->2->3->4->5. Insert 2 at the position 0 i.e. head, which currently 1 has in it. The updated linked list is 2->1->2->3->4->5
Example 2

Input

6 8
7 6 1 5 4 9 

Output

8 7 6 1 5 4 9

Explanation

The initial linked list is 7->6->1->5->4->9. Insert 8 at the position 0 i.e. head, which currently 7 has in it. The updated linked list is 8->7->6->1->5->4->9
Constraints

1 <= N <= 1000

1 <= K <= 1000
 */

import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++)
            head = insertAtEnd(head, input.nextInt());
        head = insertNode(head, k);
        print(head);
        input.close();
    }

    public static Node insertAtEnd(Node head, int data) {
        Node newnode = new Node(data);
        Node tail = null;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return head;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;
        newnode.prev = tail;
        tail = newnode;
        return head;
    }

    public static Node insertNode(Node head, int k) {
        Node newnode = new Node(k);
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
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
}