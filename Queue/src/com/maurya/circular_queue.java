package com.maurya;
//Array Implementation of Circular Queue
public class circular_queue {

    public static class Cqueue{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[10];
        public void add(int val){
            if(size == arr.length){
                System.out.println("Queue is full");
            }
            else if(size == 0){
                front = rear = 0;
            } else if(rear < arr.length - 1){
                arr[++rear] = val;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;
            }
        }
        public void remove(){
            if(size == 0){
                System.out.println("Queue is empty");
            }
            else if(front == arr.length-1){
                front = 0;
                 return;
            }
            else{
                int val = arr[front];
                front = front + 1;
                return ;
            }

        }

    }
    public static void main(String[] args) {


    }
}
