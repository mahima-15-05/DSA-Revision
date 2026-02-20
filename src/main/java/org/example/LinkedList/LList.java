package org.example.LinkedList;

public class LList {

   private   class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    private int size;
    private Node head;
    private Node tail;

    void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        // if linked list is empty
        if (head == null) {
            head = tail = newNode;
        }
        // if linked list is not empty
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int data) {
        // 1. Create new node
        Node newNode = new Node(data);
        size++;

        // 2. Check if ll is empty
        if(head==null){
            head = tail = newNode;

        }
        // 3. if ll is not empty
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }

    int getSize(){
        return this.size;
    }

    public void print() {
        Node temp = this.head;
        System.out.println();
        System.out.println("Linked list");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LList ll = new LList();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(14);
        ll.addLast(200);
        ll.print();
        System.out.println("Size "+ll.getSize());

    }


}
