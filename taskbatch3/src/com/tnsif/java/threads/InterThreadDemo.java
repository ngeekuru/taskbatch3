package com.tnsif.java.threads;

class SharedData {

    int number;
    boolean available = false;

    synchronized void produce(int number) {

        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        this.number = number;
        available = true;

        System.out.println("Produced: " + number);

        notify();
    }

    synchronized void consume() {

        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Consumed: " + number);

        available = false;

        notify();
    }
}

class Producer extends Thread {

    SharedData data;

    Producer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            data.produce(i);
        }
    }
}

class Consumer extends Thread {

    SharedData data;

    Consumer(SharedData data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            data.consume();
        }
    }
}

public class InterThreadDemo {

    public static void main(String[] args) {

        SharedData data = new SharedData();

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);

        p.start();
        c.start();
    }
}
