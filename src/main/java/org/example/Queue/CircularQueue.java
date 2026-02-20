package org.example.Queue;

public class CircularQueue {
    int[] arr;


    private int front;
    private int rear;
    private int size;

    CircularQueue(int size) {
        arr = new int[size];
        front = rear = -1;
    }

    public void enqueue(int data) {
        if(size==arr.length){
            throw new RuntimeException("Queue is full...");
        }

        // check if queue is empty
        if(rear==-1){
            front=rear=0;

        }else {
            if(size<arr.length){
                rear = (rear + 1) % arr.length;  // wrap around
            }else{
                throw new RuntimeException("Queue is full...");
            }
        }
        arr[rear] = data;
        size++;

    }


    public static void main(String[] args) {
        CircularQueue cqueue = new CircularQueue(5);
        cqueue.enqueue(1);
        cqueue.enqueue(2);
        cqueue.enqueue(3);
        cqueue.enqueue(4);
    }
}
