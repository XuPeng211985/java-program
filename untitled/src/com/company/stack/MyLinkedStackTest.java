package com.company.stack;

import com.company.stack.MyLinkedStack;

/**
 * Created by hpx on 2017/6/4.
 */
public class MyLinkedStackTest {
    public static void main(String[] args) {
        MyLinkedStack<Integer> stack = new MyLinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.peek();
       while(!stack.isEmpty()){
           System.out.print(stack.pop()+"  ");
       }
        stack.pop();
    }
}
