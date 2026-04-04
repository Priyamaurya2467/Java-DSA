package com.maurya;

import java.util.Stack;

public class min_brackets {
    public static void main(String[] args) {
        String str = "(())(";
        System.out.println(number(str));
    }
    static int number(String str) {
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');

            }
            else{
                if(stack.size()==0){
                    return 0;
                }
                else{
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                }
            }
        }
        return stack.size();
    }
}
