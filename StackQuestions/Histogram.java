package StackQuestions;

import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int[] arr={2,1,5,6,2,3};
        int[] nse=new int[arr.length];
        st.push(0);
        for (int curr=0;curr<arr.length;curr++){
            while(!st.isEmpty() && arr[st.peek()]>arr[curr]){
                nse[st.pop()]=curr;
            }
            st.push(curr);
        }
        while (!st.isEmpty()){
            nse[st.pop()]=arr.length;
        }
        st=new Stack<>();
        st.push(0);
        int[] pse=new int[arr.length];
        pse[0]=-1;
        for(int curr=1;curr<arr.length;curr++){
            while (!st.isEmpty() && arr[st.peek()]>=arr[curr]){
                st.pop();
            }
            if(!st.isEmpty())
                pse[curr]=st.peek();
            else
                pse[curr]=-1;
            st.push(curr);
        }
        System.out.print("nse list ");
        for(int ns:nse)
            System.out.print(ns+" ");
        System.out.println();
        System.out.print("pse list ");
        for(int ps:pse)
            System.out.print(ps+" ");
        System.out.println();
        int maxArea=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int area=arr[i]*(nse[i]-pse[i]-1);
            maxArea=Math.max(maxArea,area);
        }
        System.out.print(maxArea);
    }
}
