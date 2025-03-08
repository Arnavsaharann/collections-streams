package com.bridgelabz.collections.levelone;

public class ThreadsWorking {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            System.out.println("** PRINTER 1 **");
        }

        Task mytask = new Task();
        Thread thread = new Thread(mytask);
        thread.start();

        for(int i = 0; i < 20; i++){
            System.out.println("&& PRINTER 3 &&");
        }
    }
}


class Task implements Runnable{
    public void run(){
        for(int i = 0; i < 20; i++){
            System.out.println("-- PRINTER 2 --");
        }
    }
}
