package com.maurya;

import java.util.EmptyStackException;

public  class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    //if size is given
    public CustomStack(int size) {
        this.data = new int[size];
    }

    //if size is not given
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }


        return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return data[ptr];
    }
    private boolean isFull(){
        return ptr == data.length-1;  //ptr is at last index
    }
    private boolean isEmpty(){
        return ptr == -1;
    }



}
