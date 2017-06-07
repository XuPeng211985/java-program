package com.company.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hpx on 2017/6/4.
 */
public class MyStack {
    private int[] datas;
    private  int length;

    public MyStack() {
        this(20);
    }

     public MyStack(int size){
         this.datas = new int[size];
         this.length = 0;
     }
    public void push1(int data){

    }
    public boolean push(int data){
        if(this.length == this.datas.length){
            System.out.println("栈已满！");
        }else{
            this.datas[this.length++] = data;
        }
        return true;
    }

    public Integer pop(){
        if(this.length == 0){
            System.out.println("栈为空！");
            return null;
        }else{
            return this.datas[--this.length];
        }
    }


    public Integer peck(){
        if(this.length == 0){
            System.out.println("栈为空！");
            return null;
        }else{
            return this.datas[this.length - 1];
        }
    }

    public boolean isEmpty(){
        if(this.length == 0){
            return true;
        }else{
            return false;
        }
    }

    //@Override
    /*public String toString() {
        List<Integer> list = new ArrayList<>();
        if(this.isEmpty()){
            this.
        }
        return ;
    }*/

}
