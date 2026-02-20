package org.example.Queue;

public class ArrayQueue {
    int[] arr;
    int n;


    private int front;
    private int rear;
    private int size;

    ArrayQueue(int size) {
        arr = new int[size];
        n = size;
        rear = -1;
    }

    public void enque(int data) {
        //if queue is empty
        if (rear == -1) {
            rear++;
            arr[rear] = data;
            front = rear;

        } else {
            if (rear < arr.length - 1) {
                rear++;
                arr[rear] = data;
            } else {
                throw new RuntimeException("Queue overflow");
            }

        }
        size++;

        //

    }

    public void deque() {
        //if queue is empty
        if (size == 0) {
            System.out.println("Queue is empty");
            throw new RuntimeException("Queue is empty");
        } else if (size == 1) {
            int val = arr[front];
            front = -1;
            rear = -1;
            size--;
        } else {

            front++;
            size--;
        }

    }

    public int peek() {
        //if queue is empty
        if (size == 0) {
            System.out.println("Queue is empty!");
            throw new RuntimeException("Queue Underflow..");

        }

        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        int temp = front;
        while (temp <= rear) {
            System.out.print(arr[temp] + "  ");
            temp++;
        }
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        queue.enque(5);
        queue.print();
        System.out.println("After dequeue");
        queue.deque();
        System.out.println("After dequeue");
        queue.deque();
        queue.deque();
        queue.print();
        System.out.println("PEEK: " + queue.peek());
    }
}
