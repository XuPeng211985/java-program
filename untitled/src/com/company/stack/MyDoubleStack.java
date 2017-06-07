package com.company.stack;

/**
 * Created by hpx on 2017/6/4.
 */
public class MyDoubleStack {
    public static final int DEFAULT_SIZE = 20;
    private int[] datas;
    private int top1;
    private int top2;

    public MyDoubleStack() {
        this(DEFAULT_SIZE);
    }

    public MyDoubleStack(int size) {
        this.top1 = -1;
        this.top2 = size;
        this.datas = new int[size];
    }

    public void push(int number,int data){
        if(top1+1 == top2){
            System.out.println("栈已满！");
            return;
        }
        if(number == 1){
            this.datas[++top1] = data;
        }else{
            this.datas[--top2] = data;
        }
    }

    public Integer pop(int number){
        if(1 == number){
            if(top1 == -1){
                System.out.println("栈为空！");
                return null;
            }
                return datas[top1--];
        }else{
            if(top2 == this.datas.length){
                System.out.println("栈为空！");
                return null;
            }
                return datas[top2++];
        }
    }

    public Integer peek(int number){
        if(1 == number){
            if(top1 == -1){
                System.out.println("栈为空！");
                return null;
            }
            return datas[top1];
        }else{
            if(top2 == this.datas.length){
                System.out.println("栈为空！");
                return null;
            }
            return datas[top2];
        }
    }

    public boolean isEmpty(int number) {
        if (1 == number) {
           if(top1 == -1){
               return true;
           }
           return false;
        } else {
            if(top2 == this.datas.length){
                return true;
            }
            return false;
        }
    }
}
