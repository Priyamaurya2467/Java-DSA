package com.maurya;

public class ArrayImplementation {
    public static class queueArray{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new  int[10];
        public void add(int x){
            if(f==-1){
                f=0;
                r=0;
            }
            if(r==arr.length-1){
                System.out.println("Queue is full");
            }
            else{
                arr[r]=x;
                r++;

            }
            size++;

        }
        public int remove(){
            if(f==-1){
                System.out.println("Queue is empty");
            }
            else{
                f++;
            }
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(f==-1){
                System.out.println("Queue is empty");
            }
            size--;
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is empty");
            }
            else{
                for(int i=0;i<size;i++){
                    System.out.print(arr[i]+" ");

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();


    }
}
