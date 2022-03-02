package StackQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class FormMinimumNumber {
    public static void main(String[] args) {
        String str="<><";
        ArrayList<Character> list=new ArrayList<>();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<=str.length();i++){
            int a=65+i;
            char ch=(char)a;
            st.push(ch);
            if(i==str.length() || str.charAt(i)=='<'){
                StringBuilder sb=new StringBuilder();
                while(!st.isEmpty()) {
                    list.add(st.pop());
                }
            }
        }
        System.out.println(list);
//        ArrayList<Integer> as=new ArrayList<>();
//        as.add(40);
//        as.add(20);
//        as.add(30);
//        Collections.sort(as, Collections.reverseOrder());
//        System.out.println(as);
    }
}
