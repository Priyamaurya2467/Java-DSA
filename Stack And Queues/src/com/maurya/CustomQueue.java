package com.maurya;

public  class CustomQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    int end = -1;
    //if size is given
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    //if size is not given
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }


        return data[end--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return data[end];
    }
    private boolean isFull(){
        return end == data.length-1;  //ptr is at last index
    }
    private boolean isEmpty(){
        return end == -1;
    }



}
