package com.maurya;

public class main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insert(15);
        list.insert(16);
        list.display();
        list.delete(14);
        list.display();
    }
}
