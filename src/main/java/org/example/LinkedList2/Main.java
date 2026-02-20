package org.example.LinkedList2;

class LinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private int size;
    private Node head;
    private Node tail;


    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {

        //1. create new node
        Node newNode = new Node(data);
        size++;

        //2. check if ll is empty
        if (isEmpty()) {
            head = tail = newNode;
        }

        //3. if ll is not empty
        else {
            newNode.next = head;
            head = newNode;
        }


    }

    public void addLast(int data) {
        //1. Create new node
        Node newNode = new Node(data);
        size++;

        //2. Check if list is empty
        if (isEmpty()) {
            head = tail = newNode;
        }

        //3. if list is not empty
        else {
            tail.next = newNode;
            tail = newNode;
        }


    }

    //    public  void print(){
    //        Node temp = head;
    //
    //        while(temp!=null){
    //            System.out.print(temp.data+" -> ");
    //            temp=temp.next;
    //        }
    //        System.out.println("null");
    //    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;

        while (temp != null) {
            sb.append(temp.data + " -> ");
            temp = temp.next;
        }
        sb.append("null");

        return sb.toString();

    }

    public int getSize() {
        return size;
    }

    public void addElementAtIndex(int index, int data) {

        //1. if irrelevant index
        if (index < 0 || getSize() < index) {
            System.out.println("invalid index!");
            return;
        }

        //2. If index = 0;
        if (index == 0) {
            addFirst(data);
            return;
        }

        //3. if index = size-1;
        if (index == getSize()) {
            addLast(data);
            return;
        }


        //4. Create a new Node
        Node newNode = new Node(data);
        size++;

        //5. insert

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(getSize()==0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if(getSize()==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        //1. if list is empty
        if(getSize()==0){
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }

        if(getSize()==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node temp = head;
        while(temp.next!=tail){
            temp=temp.next;
        }


        int val = tail.data;
        temp.next=null;
        tail= temp;
        size--;
        return val;


    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(8);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(9);

        System.out.println(ll);
        System.out.println("Size: " + ll.getSize());
        ll.addElementAtIndex(2, 15);
        System.out.println(ll+" Size: "+ll.getSize());
        ll.removeFirst();
        System.out.println(ll+" Size: "+ll.getSize());



    }
}
