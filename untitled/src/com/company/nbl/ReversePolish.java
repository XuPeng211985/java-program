package com.company.nbl;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import static com.company.nbl.Calculator.isNumber;

/**
 * Created by hpx on 2017/6/6.
 */
public class ReversePolish {
    public static Integer getPriority(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }
        if(ch == '*' || ch == '/'){
            return 2;
        }
        if(ch == '(' || ch == ')'){
            return 3;
        }
        return null;
    }
    public static void revresePolish(String reverse) {
        Stack<Character> stack = new Stack<>();
        List<Character>  list = new ArrayList<>();
        for (int i = 0; i < reverse.length(); i++) {
            char ch = reverse.charAt(i);
            if (isNumber(ch)) {
                list.add(ch);
            }else{
                if(stack.isEmpty()){
                    stack.push(ch);
                    continue;
                }
                if(ch == '('){
                    stack.push(ch);
                   continue;
                }
                if(getPriority(ch)< getPriority(stack.peek())){
                    if(stack.peek() == '('){
                        stack.push(ch);
                        continue;
                    }
                    list.add(stack.pop());
                    stack.push(ch);
                    return;
                }
                stack.push(ch);
                if(ch == ')'){
                    while(stack.peek() != '('){
                        list.add(stack.pop());
                    }
                    stack.pop();
                    continue;
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ReversePolish polish =  new ReversePolish();
        revresePolish("9+(3-1)*3+10/2");
    }
}
