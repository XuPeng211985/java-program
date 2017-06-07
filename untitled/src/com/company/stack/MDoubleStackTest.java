package com.company.stack;

/**
 * Created by hpx on 2017/6/4.
 */
public class MDoubleStackTest {
    public static void main(String[] args) {
        MyDoubleStack stack = new MyDoubleStack(10);
        stack.push(1,5);
        stack.push(1,4);
        stack.push(1,3);
        stack.push(1,2);
        stack.push(1,1);
        stack.push(2,10);
        stack.push(2,9);
        stack.push(2,8);
        stack.push(2,7);
        stack.push(2,6);
        stack.push(1,1);
        stack.pop(1);
        stack.push(2,1);
        System.out.println(stack.peek(1));
        System.out.println(stack.peek(2));
        while(!stack.isEmpty(1)){
            System.out.print(stack.pop(1)+" ");
        }
        System.out.println();
        while(!stack.isEmpty(2)){
            System.out.print(stack.pop(2)+" ");
        }
        stack.pop(1);
     }
}
