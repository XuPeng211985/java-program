package com.company.nbl;
import java.util.Stack;
/**
 * Created by hpx on 2017/6/4.
 */
public class Calculator {
    public static boolean isNumber(char i){
        if(i>='1' && i<='9'){
            return true;
        }
        return false;
    }

    public static int calculate(int a,int b,char c){
        if('+' == c){
            return a+b;
        }
        if('-' == c){
            return b-a;
        }
        if('*' == c){
            return a*b;
        }
        if('/' == c){
            return b/a;
        }
        return 0;
    }

    public static int calculator(String reverse)throws Exception{
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<reverse.length();i++){
            char ch = reverse.charAt(i);
            if(isNumber(ch)){
                stack.push(Integer.valueOf(String.valueOf(ch)));
                continue;
            }
            int operand = stack.pop();
            int lastoperand = stack.pop();
            stack.push(calculate(operand,lastoperand,ch));
        }
        return stack.pop();
    }

    public static void main(String[] args) throws Exception {
        Calculator calculator1 = new Calculator();
        int resault = 0;
        resault = calculator1.calculator("94*52-7*-5+");
        System.out.println(resault);
    }
}
