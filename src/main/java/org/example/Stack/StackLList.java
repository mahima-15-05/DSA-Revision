package org.example.Stack;

import java.util.LinkedList;

public class StackLList {
    private class Node{
        int data;
        Node next;

        Node(int data){
           this.data = data;
           this.next=null;
        }
    }

        private int size;
        private Node head;

        public void push(int data){
            // create a new element
            Node newNode = new Node(data);
            size++;
            newNode.next=  head;
            head =newNode;




        }

        public int getSize() {
        return size;
    }

        public int pop(){
            //if stack is empty
            if(head == null){
                System.out.println("Stack is empty");
                throw new RuntimeException("Stack Underflow");
            }else{
                int val = head.data;
                head = head.next;
                size--;
                return val;
            }


        }

        public int peek(){
            //if stack is empty
            if(head == null){
                System.out.println("Stack is empty");
                throw new RuntimeException("Stack Underflow");

            }else{
                return head.data;
            }
        }

    @Override
    public String toString(){
            StringBuilder sb = new StringBuilder();
            Node temp = head;
            while(temp!=null){
                sb.append(temp.data+"->");
                temp=temp.next;
            }
            sb.append("null");

            return sb.toString();
        }


}
class MainStack{
    public static void main(String[] args) {
        StackLList list= new StackLList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        System.out.println("Stack "+list.toString());

        list.pop();
        System.out.println("Stack "+list.toString());
        System.out.println("Size: "+list.getSize());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println("Stack "+list.toString());
        System.out.println("Size: "+list.getSize());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());

        System.out.println("Stack "+list.toString());
        System.out.println("Size: "+list.getSize());




    }

}