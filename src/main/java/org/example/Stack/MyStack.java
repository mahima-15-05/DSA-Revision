package org.example.Stack;

/*
* Stack is a linear data structure which follows LIFO order
*
* 1. Implicit Stack: It is a call stack that is automatically managed by the system.
*    - Used when function call or recursive call happens
*    - We don't write the code to manage it, the compiler or interpreter manages it
*      for us
*
* 2. Explicit Stack: It is kind of stack which you manually manage using a data
*    structure such as Array, stack class, or LinkedList
*
*    - Useful for converting recursion or solving problems like DFS, backtracking etc
*/


import java.util.ArrayList;

// Implement stack using ArrayList
public class MyStack {

    ArrayList<Integer> stack = new ArrayList<>();
    private int size;

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int top(){
        //1. if stack is empty
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size()-1);

    } public void pop(){
        //1. if stack is empty
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
         stack.remove(stack.size()-1);
        size--;

    } public void push(int data){
        stack.add(data);
        size++;
    }

    public void print(){
        for(int i=0; i<size; i++){
            System.out.print(stack.get(i)+"  ");
        }
    }
}

class Main{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);

        stack.print();
        System.out.println();
        System.out.println("TOP: "+stack.top());
        stack.pop();
        System.out.println();

        stack.print();
        System.out.println("TOP: "+stack.top());

    }
}
