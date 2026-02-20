package org.example.Stack;

import java.util.Stack;

public class MyStack1 {
    public static void pushAtBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data);
            return;
        }


        int ele = st.pop();

        pushAtBottom(st, data);

        st.push(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        pushAtBottom(st, 10);
        System.out.println(st);

    }
}
