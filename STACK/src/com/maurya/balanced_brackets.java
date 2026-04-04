package com.maurya;

import java.util.Scanner;
import java.util.Stack;

public class balanced_brackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isbalanced(str));
    }
    static boolean isbalanced(String str){
        Stack<Character> stack=new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    if (stack.peek() == '(') {
                        stack.pop();

                    }
                }
            }
        }

                if (stack.size() > 0) {
                    return false;
                }

        return true;
    }
}
