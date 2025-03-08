package com.bridgelabz.collections.levelone;

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(5);
        buffer.enqueue(3);
        buffer.enqueue(5);
        buffer.enqueue(6);
        buffer.enqueue(7);
        buffer.enqueue(8);

        buffer.printBufferContents();

        buffer.dequeue();

        buffer.printBufferContents();

    }
}

class CircularBuffer{
    private int front;
    private int rear;
    private int size;
    private int capacity;
    int[] buffer;

    public CircularBuffer(int capacity){
        this.capacity = capacity;
        this.rear = -1;
        this.front = 0;
        this.size = 0;
        this.buffer = new int[capacity];
    }

    public void enqueue(int data){
        rear = (rear + 1) % capacity;
        buffer[rear] = data;

        if(size < capacity){
            size++;
        }else{
            front = (front + 1) % capacity;
        }
    }

    public void dequeue(){
        if(size == 0){
            System.out.println("No tasks present in the circular buffer");
        }else{
            int value = buffer[front];
            System.out.println("the element is removed is: " + value);
            front = (front + 1) % capacity;
            size--;
        }
    }

    public void printBufferContents(){
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();

    }
}
