package org.example.LinkedList;

 class LinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    static void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        //if linkedlist is empty
        if(head == null){
            head=tail=newNode;
            return;
        }

        // if list is not empty
        newNode.next=head;
        head=newNode;


    }

     public static void main(String[] args) {
         LinkedList ll = new LinkedList();
         ll.addFirst(1);
         ll.addFirst(2);
         ll.addFirst(3);
         ll.addFirst(4);

         for(int i=0; i<ll.size;i++ ){

             System.out.print(head.data+"  ");
             head = head.next;
         }

     }
}
