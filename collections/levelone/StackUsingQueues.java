package com.bridgelabz.collections.levelone;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    // Push operation (Costly)
    public void push(int x) {
        queue2.add(x); // Add new element to queue2

        // Move all elements from queue1 to queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop operation
    public int pop() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.poll(); // Remove front element
    }

    // Top operation
    public int top() {
        if (queue1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue1.peek(); // Return front element
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());  // Output: 3
        System.out.println("Pop: " + stack.pop());  // Output: 3
        System.out.println("Pop: " + stack.pop());  // Output: 2
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: false
    }
}

