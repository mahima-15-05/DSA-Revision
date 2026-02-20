package org.example.LinkedList2;

import java.util.ArrayList;

public class SearchInLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;


    public void addFirst(int data) {
        //1. Create new node
        Node newNode = new Node(data);
        size++;

        //2. if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //3. insert at first
        newNode.next = head;
        head = newNode;
        return;
    }

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

    public int search(int key) {
        int count = 0;
        //1. if linkedlist is empty
        if (size == 0) return -1;

        Node temp = head;
        while (temp != null) {
            if (key == temp.data) return count;
            else count++;
            temp = temp.next;
        }


        return -1;

    }

    public ArrayList<Integer> allPos(int key) {
        ArrayList<Integer> ans = new ArrayList<>();

        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == key) {
                ans.add(count);

            }
            count++;
            temp = temp.next;
        }
        return ans;
    }

    public ArrayList<Integer> findPos(Node temp, ArrayList<Integer> ans,int key, int index){
        if(temp==null)return ans;
        if(temp.data==key){
            ans.add(index);

        }
        index++;

        return findPos(temp.next, ans, key, index);



    }
    public ArrayList<Integer> recursivePos(int key){
        ArrayList<Integer> ans = new ArrayList<>();
        Node temp = head;
        int index=0;
        return findPos(temp,ans, key, index);
    }

}

class Calling {
    public static void main(String[] args) {
        SearchInLinkedList ll = new SearchInLinkedList();
        ll.addFirst(33);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(33);
        ll.addFirst(4);
        ll.addFirst(54);
        ll.addFirst(33);
        ll.addFirst(23);
        ll.addFirst(33);
        System.out.println(ll);
        System.out.println(ll.allPos(33));
        System.out.println(ll.recursivePos(33));
    }
}
