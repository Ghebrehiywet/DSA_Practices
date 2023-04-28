package com.github.gridu.dsa;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int frontElem;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        if (stack1.empty()) {
            frontElem = x;
        }
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        int item = stack2.pop();
        frontElem = stack2.empty() ? 0 : stack2.peek();

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return item;
    }

    public int peek() {
        return frontElem;
    }

    public boolean empty() {
        return stack1.empty();
    }
}
