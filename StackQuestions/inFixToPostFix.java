package StackQuestions;

import java.util.Stack;

public class inFixToPostFix {
    static int precedence(char ch){
        if(ch=='^'){
            return 3;
        }
        else if(ch=='/' || ch=='*'){
            return 2;
        }
        else if(ch=='+' || ch=='-'){
            return 1;
        }
        else{
            return 0;
        }
    }
    static String infixPostFix(String str){
        String st="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                stack.push('(');
            }
            else if(ch==')'){
                while(stack.peek()!='('){
                    st+=stack.pop();
                }
                stack.pop();
            }
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                st+=ch;
            }
            else {
                while(!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                    st+=stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            st+=stack.pop();
        }
        return st;
    }
    public static void main(String[] args) {
        String str="y*(x+(r*s+y)*c)";
        str=infixPostFix(str);
        System.out.println(str);
    }
}
