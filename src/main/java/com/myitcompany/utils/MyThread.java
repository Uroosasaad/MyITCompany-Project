package com.myitcompany.utils;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread run - The end: " + Thread.currentThread().getName());
    }
}
