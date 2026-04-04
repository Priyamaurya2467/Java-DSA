package com.maurya;

public class CircularQueue {

    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    //if size is given
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    private boolean isFull() {
        return size == data.length;  //ptr is at last index
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[size++] = item;
        end = end % data.length;
        return true;
    }

}
