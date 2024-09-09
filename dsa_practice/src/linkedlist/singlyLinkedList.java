package linkedlist;

import java.util.LinkedList;

public class singlyLinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);

        list.display();

    }
}
