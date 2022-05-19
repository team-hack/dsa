package com.blind75.helper;

public abstract class Task {

    protected abstract void run();

    protected void printArray(int[] arr, String msg) {
        System.out.println("****" + msg + " starts");
        for (int num : arr) {
            System.out.println("*** item = [" + num + "] ***");
        }
        System.out.println("****" + msg + " ends");

    }
}
