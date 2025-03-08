package com.bridgelabz.collections.levelone;

class MyTask extends Thread {
    private String taskName;

    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " is running - iteration " + i);
            try {
                Thread.sleep(500); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Creating thread objects directly (No need for Runnable)
        MyTask t1 = new MyTask("Thread-1");
        MyTask t2 = new MyTask("Thread-2");
        MyTask t3 = new MyTask("Thread-3");

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();
        t2.start();
    }
}
