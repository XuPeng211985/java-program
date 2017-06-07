package com.company.stack;

/**
 * Created by hpx on 2017/6/4.
 */
public class MyLinkedStack<T> {
    private Node top;

    private class Node{
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T data){
        Node node = new Node(data);
        if(this.top != null){
            node.next = this.top;
        }
            this.top = node;
    }

    public T pop(){
        if(this.top == null){
            System.out.println("栈为空！");
            return null;
        }
        T a = this.top.data;
        this.top = this.top.next;
        return a;
    }

    public boolean isEmpty(){
        if(this.top == null){
            return true;
        }
        return false;
    }
    public void peek(){
        System.out.println(this.top.data);
    }
}
